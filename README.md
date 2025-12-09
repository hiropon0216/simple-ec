# Simple EC Platform (Next.js × FastAPI × Supabase)

本リポジトリは、**Next.js（フロントエンド） × FastAPI（バックエンド） × Supabase（DB/認証）** を用いて構築した  
シンプルなECアプリケーション

---

## 🎯 プロジェクト概要

このアプリケーションは以下を目的に設計している：

- **フロント（Next.js）とバックエンド（FastAPI）の設計学習**
- **REST API 設計**
- **Supabase を活用したシンプルな DB・認証基盤の構築**
- **ローカル〜本番環境（Vercel / Render）までのデプロイ**

---

## 🚀 使用技術

### **Frontend**
- Next.js 15（App Router）
- TypeScript
- Tailwind CSS
- React Server Components

### **Backend**
- FastAPI（Python）
- Uvicorn

### **Database / Auth**
- Supabase (PostgreSQL)
- RLS（Row Level Security）を用いた安全な認証・データ管理

### **Infrastructure / DevOps**
- Vercel（フロントデプロイ）
- Render or Fly.io（API デプロイ予定）
- GitHub（バージョン管理）
- GitHub Actions（CI/CD 導入予定）

---

## 🛒 実装機能（Minimum Operational Features）

以下は実務の PoC や MVP 開発でもよく使われる構成です：

### ✔ フロントエンド
- 商品一覧ページ
- 商品詳細ページ  
- カートへの追加（簡易版 UI）
- ログイン / ログアウト（Supabase Auth）

### ✔ バックエンド API（FastAPI）
- 商品一覧取得 API
- 商品詳細取得 API
- カート操作 API（簡易）

### ✔ データベース（Supabase）
- `products` テーブル  
- `users` テーブル  
- `cart_items` テーブル  
（仮スキーマのため後で拡張可能）

---

## 📁 ディレクトリ構成（予定）

```
/ (root)
├── frontend/ # Next.js
│ ├── src/
│ └── ...
├── backend/ # FastAPI
│ ├── app/
│ └── ...
└── README.md
```

## 学習メモ

📘 Next.js / React / TypeScript の基礎理解（学習メモ）

このプロジェクトでは、フロントエンド開発の基礎技術として以下を学習・実装した。

## 🟦 1. Next.js と React の関係

React

UI を作るためのライブラリ

コンポーネントという単位で画面を組み立てる

ルーティングや SSR（サーバーサイドレンダリング）は自前では持たない

Next.js

React をベースにした “フレームワーク”

ルーティング・SSR・API Routes など「実用的な機能」を提供

実務で圧倒的に使われている構成

👉 Next.js = React を便利に使うためのフレームワーク

🟦 2. App Router とページ構成（/app ディレクトリ）

Next.js 13 以降の新しい仕組み「App Router」を使用。

app/page.tsx → トップページ

app/products/page.tsx → /products で表示されるページ

app/login/page.tsx → /login のページ

👉 フォルダ = URL / ファイル = ページ
という直感的なルーティングが可能。

🟦 3. layout.tsx と共通レイアウト

app/layout.tsx は全ページに自動適用される共通レイアウト。

できること：

<html> / <body> の設定

全ページ共通のヘッダー / フッター

ページ内容を {children} に挿入

例：

export default function RootLayout({ children }: { children: React.ReactNode }) {
  return (
    <html lang="ja">
      <body>
        <Header />
        {children}
      </body>
    </html>
  );
}


👉 {children} は「そのページの内容を差し込む特別な変数」。

🟦 4. React コンポーネントの理解

関数を使って UI を定義する

必ずコンポーネント名は大文字から開始

JSX 記法で HTML のように書く

例：

export default function ProductsPage() {
  return <div>Products</div>;
}


👉 すべての画面をコンポーネントとして構築する。

🟦 5. TypeScript の導入

Next.js はデフォルトで TypeScript に対応。

学習したポイント：

✔ useState に型をつける
const [email, setEmail] = useState<string>("");


👉 email は必ず string になる保証がある。

✔ イベント引数に型をつける
const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
  e.preventDefault();
};


👉 Form のイベントであることが明確になり、補完が効く。

✔ データ型の定義
type Product = {
  id: number;
  name: string;
  price: number;
};


👉 今後 API 連携しても流用できる「実務的な型定義」。

🟦 6. Products ページの作成

型をつけた Product リスト

.map() を使って複数商品を表示

Tailwind CSS でデザイン

学習ポイント：

型のついたデータ配列（Product[]）

React のループレンダリング

className によるスタイリング

コンポーネント分割の基礎

🟦 7. Login ページの作成

"use client" を使ったクライアントコンポーネント

useState による入力管理

onChange で状態を更新

フォーム送信の基礎動作

学習した TS の型：

React.FormEvent<HTMLFormElement>

React.ChangeEvent<HTMLInputElement>

👉 今後バックエンドの認証 API と繋げる基礎ができた。

🟩 まとめ

ここまでで理解できたポイント：

Next.js は React のフレームワークである

App Router を使ったモダンなページ構成

layout.tsx による共通レイアウトの理解

JSX / TSX で React コンポーネントを書ける

TypeScript の基本（型定義・イベント型・useState の型指定）

map() で一覧を作る実践的 UI

useState, onChange, form 送信などフロントの基礎

Tailwind CSS を使ったスタイリング

👉 すでに Next.js × TypeScript の実務開発の「最初の一歩」を完全にクリアしている。
