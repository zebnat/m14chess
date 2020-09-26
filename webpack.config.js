var path = require('path');

module.exports = {
  watch: true,
  mode: 'development',
  entry: './src/main/javascript/index.js',
  output: {
    path: path.resolve(__dirname),
    filename: './src/main/webapp/js/app.js'
  },
  module: {
    rules: [
      {
        test: /\.css$/i,
        use: ['style-loader', 'css-loader'],
      },
      {
        test: /\.(js|jsx)$/,
        exclude: /node_modules/,
        use: {
          loader: "babel-loader"
        }
      },
      {
        test: /\.(png|jpe?g|gif|svg|eot|ttf|woff|woff2)$/i,
        loader: 'url-loader',
        options: {
          limit: 8192,
        },
      },
    ]
  }
};

