# GraphQLサンプルプロジェクト
- GraphQLサーバへデータを返すためのAPI構築

## 動作前提
- [lcc_frontend_education/tree/feature/tsuchiya](https://github.com/lightcafecreation/lcc_frontend_education/tree/feature/tsuchiya)を手元にgit clone
- exercises13のGraphQLサーバ（なんちゃってRestAPIでDBから取得）を起動している
- 本プロジェクトのMySQLを起動している
  - ディレクトリMySQL > dockerで、"docker-compose up -d"コマンドを実行。
  - "docker-compose ps"コマンドでstatusがupとなっていることを確認。
  
## 本プロジェクト（Java)の起動
- EclipseやIntellij IDEAなどのIDEでで本プロジェクトをインポートし、アプリケーションを実行する。（VSCODEでもJavaのプラグインを入れていれば動くはず）