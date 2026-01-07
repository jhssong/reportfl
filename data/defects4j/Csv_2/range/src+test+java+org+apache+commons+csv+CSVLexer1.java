{
  "filepath": "/tmp/Csv-2b/src/test/java/org/apache/commons/csv/CSVLexer1.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVLexer1",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.csv.Lexer"
      ],
      "begin_line": 32,
      "end_line": 247,
      "comment": "\n * \n * \n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "wsBuf"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVLexer1.CSVLexer1(org.apache.commons.csv.CSVFormat, org.apache.commons.csv.ExtendedBufferedReader)",
      "begin_line": 37,
      "end_line": 39,
      "comment": " ctor needs to be public so can be called dynamically by PerformanceTest class",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer1.nextToken(org.apache.commons.csv.Token)",
      "begin_line": 50,
      "end_line": 134,
      "comment": "\n     * Returns the next token.\n     * \u003cp/\u003e\n     * A token corresponds to a term, a record change or an end-of-file indicator.\n     *\n     * @param tkn an existing Token object to reuse. The caller is responsible to initialize the Token.\n     * @return the next token found\n     * @throws java.io.IOException on stream access error\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 27)",
        "(line 55,col 9)-(line 55,col 40)",
        "(line 62,col 9)-(line 62,col 26)",
        "(line 63,col 9)-(line 63,col 39)",
        "(line 64,col 9)-(line 64,col 29)",
        "(line 67,col 9)-(line 82,col 9)",
        "(line 85,col 9)-(line 88,col 9)",
        "(line 91,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer1.simpleTokenLexer(org.apache.commons.csv.Token, int)",
      "begin_line": 153,
      "end_line": 184,
      "comment": "\n     * A simple token lexer\n     * \u003cp/\u003e\n     * Simple token are tokens which are not surrounded by encapsulators.\n     * A simple token might contain escaped delimiters (as \\, or \\;). The\n     * token is finished when one of the following conditions become true:\n     * \u003cul\u003e\n     *   \u003cli\u003eend of line has been reached (EORECORD)\u003c/li\u003e\n     *   \u003cli\u003eend of stream has been reached (EOF)\u003c/li\u003e\n     *   \u003cli\u003ean unescaped delimiter has been reached (TOKEN)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param tkn the current token\n     * @param c   the current character\n     * @return the filled token\n     * @throws IOException on stream access error\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer1.encapsulatedTokenLexer(org.apache.commons.csv.Token, int)",
      "begin_line": 199,
      "end_line": 245,
      "comment": "\n     * An encapsulated token lexer\n     * \u003cp/\u003e\n     * Encapsulated tokens are surrounded by the given encapsulating-string.\n     * The encapsulator itself might be included in the token using a\n     * doubling syntax (as \"\", \u0027\u0027) or using escaping (as in \\\", \\\u0027).\n     * Whitespaces before and after an encapsulated token are ignored.\n     *\n     * @param tkn the current token\n     * @param c   the current character\n     * @return a valid token object\n     * @throws IOException on invalid state\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 53)",
        "(line 204,col 9)-(line 244,col 9)"
      ]
    }
  ]
}