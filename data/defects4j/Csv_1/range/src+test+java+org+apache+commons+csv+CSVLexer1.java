{
  "filepath": "/tmp/Csv-1b/src/test/java/org/apache/commons/csv/CSVLexer1.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVLexer1",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.csv.Lexer"
      ],
      "begin_line": 24,
      "end_line": 238,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wsBuf"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVLexer1.CSVLexer1(org.apache.commons.csv.CSVFormat, org.apache.commons.csv.ExtendedBufferedReader)",
      "begin_line": 29,
      "end_line": 31,
      "comment": " ctor needs to be public so can be called dynamically by PerformanceTest class",
      "child_ranges": [
        "(line 30,col 9)-(line 30,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer1.nextToken(org.apache.commons.csv.Token)",
      "begin_line": 42,
      "end_line": 125,
      "comment": "\n     * Returns the next token.\n     * \u003cp/\u003e\n     * A token corresponds to a term, a record change or an end-of-file indicator.\n     *\n     * @param tkn an existing Token object to reuse. The caller is responsible to initialize the Token.\n     * @return the next token found\n     * @throws java.io.IOException on stream access error\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 27)",
        "(line 47,col 9)-(line 47,col 38)",
        "(line 54,col 9)-(line 54,col 26)",
        "(line 55,col 9)-(line 55,col 37)",
        "(line 56,col 9)-(line 56,col 27)",
        "(line 59,col 9)-(line 74,col 9)",
        "(line 77,col 9)-(line 80,col 9)",
        "(line 83,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer1.simpleTokenLexer(org.apache.commons.csv.Token, int)",
      "begin_line": 144,
      "end_line": 175,
      "comment": "\n     * A simple token lexer\n     * \u003cp/\u003e\n     * Simple token are tokens which are not surrounded by encapsulators.\n     * A simple token might contain escaped delimiters (as \\, or \\;). The\n     * token is finished when one of the following conditions become true:\n     * \u003cul\u003e\n     *   \u003cli\u003eend of line has been reached (EORECORD)\u003c/li\u003e\n     *   \u003cli\u003eend of stream has been reached (EOF)\u003c/li\u003e\n     *   \u003cli\u003ean unescaped delimiter has been reached (TOKEN)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param tkn the current token\n     * @param c   the current character\n     * @return the filled token\n     * @throws IOException on stream access error\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 174,col 9)-(line 174,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer1.encapsulatedTokenLexer(org.apache.commons.csv.Token, int)",
      "begin_line": 190,
      "end_line": 236,
      "comment": "\n     * An encapsulated token lexer\n     * \u003cp/\u003e\n     * Encapsulated tokens are surrounded by the given encapsulating-string.\n     * The encapsulator itself might be included in the token using a\n     * doubling syntax (as \"\", \u0027\u0027) or using escaping (as in \\\", \\\u0027).\n     * Whitespaces before and after an encapsulated token are ignored.\n     *\n     * @param tkn the current token\n     * @param c   the current character\n     * @return a valid token object\n     * @throws IOException on invalid state\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 46)",
        "(line 195,col 9)-(line 235,col 9)"
      ]
    }
  ]
}