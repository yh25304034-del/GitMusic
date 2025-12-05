<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>ユーザー登録</title>
    </head>
    <body>
        <h1>ユーザー登録</h1>
        <form method="POST" action="./MusicServlet">
            <h2>名前</h2>
            <input type="text" name="name">
            <h2>好きな曲</h2>
            <input type="text" name="music"><br>
            <input type="submit" name="登録" />
        </form>
    </body>
</html>