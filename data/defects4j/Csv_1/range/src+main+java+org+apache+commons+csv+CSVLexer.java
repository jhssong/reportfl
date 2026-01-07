{
  "filepath": "/tmp/Csv-1b/src/main/java/org/apache/commons/csv/CSVLexer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVLexer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.csv.Lexer"
      ],
      "begin_line": 24,
      "end_line": 227,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVLexer.CSVLexer(org.apache.commons.csv.CSVFormat, org.apache.commons.csv.ExtendedBufferedReader)",
      "begin_line": 27,
      "end_line": 29,
      "comment": " ctor needs to be public so can be called dynamically by PerformanceTest class",
      "child_ranges": [
        "(line 28,col 9)-(line 28,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer.nextToken(org.apache.commons.csv.Token)",
      "begin_line": 40,
      "end_line": 118,
      "comment": "\n     * Returns the next token.\n     * \u003cp/\u003e\n     * A token corresponds to a term, a record change or an end-of-file indicator.\n     *\n     * @param tkn an existing Token object to reuse. The caller is responsible to initialize the Token.\n     * @return the next token found\n     * @throws java.io.IOException on stream access error\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 38)",
        "(line 51,col 9)-(line 51,col 26)",
        "(line 52,col 9)-(line 52,col 37)",
        "(line 53,col 9)-(line 53,col 27)",
        "(line 56,col 9)-(line 72,col 9)",
        "(line 75,col 9)-(line 79,col 9)",
        "(line 82,col 9)-(line 116,col 9)",
        "(line 117,col 9)-(line 117,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer.simpleTokenLexer(org.apache.commons.csv.Token, int)",
      "begin_line": 137,
      "end_line": 166,
      "comment": "\n     * A simple token lexer\n     * \u003cp/\u003e\n     * Simple token are tokens which are not surrounded by encapsulators.\n     * A simple token might contain escaped delimiters (as \\, or \\;). The\n     * token is finished when one of the following conditions become true:\n     * \u003cul\u003e\n     *   \u003cli\u003eend of line has been reached (EORECORD)\u003c/li\u003e\n     *   \u003cli\u003eend of stream has been reached (EOF)\u003c/li\u003e\n     *   \u003cli\u003ean unescaped delimiter has been reached (TOKEN)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param tkn the current token\n     * @param c   the current character\n     * @return the filled token\n     * @throws IOException on stream access error\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer.encapsulatedTokenLexer(org.apache.commons.csv.Token, int)",
      "begin_line": 181,
      "end_line": 225,
      "comment": "\n     * An encapsulated token lexer\n     * \u003cp/\u003e\n     * Encapsulated tokens are surrounded by the given encapsulating-string.\n     * The encapsulator itself might be included in the token using a\n     * doubling syntax (as \"\", \u0027\u0027) or using escaping (as in \\\", \\\u0027).\n     * Whitespaces before and after an encapsulated token are ignored.\n     *\n     * @param tkn the current token\n     * @param c   the current character\n     * @return a valid token object\n     * @throws IOException on invalid state\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 46)",
        "(line 186,col 9)-(line 224,col 9)"
      ]
    }
  ]
}