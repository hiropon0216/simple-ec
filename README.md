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