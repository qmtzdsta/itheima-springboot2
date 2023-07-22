import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            // 连接MySQL数据库
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/web?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=UTF-8";
            String dbUsername = "root";
            String dbPassword = "root";
            Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);

            // 查询用户名和密码是否匹配
            String sql = "SELECT * FROM t_student WHERE userName=? AND password=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                // 登录成功
                response.getWriter().println("Login successful");
            } else {
                // 登录失败
                response.getWriter().println("Login failed");
            }

            // 关闭数据库连接
            resultSet.close();
            statement.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
