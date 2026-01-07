{
  "filepath": "/tmp/Csv-3b/src/test/java/org/apache/commons/csv/CSVLexer1306663.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVLexer1306663",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.csv.Lexer"
      ],
      "begin_line": 33,
      "end_line": 235,
      "comment": "\n * \n * \n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVLexer1306663.CSVLexer1306663(org.apache.commons.csv.CSVFormat, org.apache.commons.csv.ExtendedBufferedReader)",
      "begin_line": 36,
      "end_line": 38,
      "comment": " ctor needs to be public so can be called dynamically by PerformanceTest class",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer1306663.nextToken(org.apache.commons.csv.Token)",
      "begin_line": 49,
      "end_line": 128,
      "comment": "\n     * Returns the next token.\n     * \u003cp/\u003e\n     * A token corresponds to a term, a record change or an end-of-file indicator.\n     *\n     * @param tkn an existing Token object to reuse. The caller is responsible to initialize the Token.\n     * @return the next token found\n     * @throws java.io.IOException on stream access error\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 40)",
        "(line 56,col 9)-(line 56,col 26)",
        "(line 58,col 9)-(line 62,col 9)",
        "(line 68,col 9)-(line 68,col 39)",
        "(line 69,col 9)-(line 69,col 29)",
        "(line 72,col 9)-(line 86,col 9)",
        "(line 89,col 9)-(line 93,col 9)",
        "(line 96,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer1306663.simpleTokenLexer(org.apache.commons.csv.Token, int)",
      "begin_line": 147,
      "end_line": 174,
      "comment": "\n     * A simple token lexer\n     * \u003cp/\u003e\n     * Simple token are tokens which are not surrounded by encapsulators.\n     * A simple token might contain escaped delimiters (as \\, or \\;). The\n     * token is finished when one of the following conditions become true:\n     * \u003cul\u003e\n     *   \u003cli\u003eend of line has been reached (EORECORD)\u003c/li\u003e\n     *   \u003cli\u003eend of stream has been reached (EOF)\u003c/li\u003e\n     *   \u003cli\u003ean unescaped delimiter has been reached (TOKEN)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param tkn the current token\n     * @param c   the current character\n     * @return the filled token\n     * @throws IOException on stream access error\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 173,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer1306663.encapsulatedTokenLexer(org.apache.commons.csv.Token)",
      "begin_line": 188,
      "end_line": 233,
      "comment": "\n     * An encapsulated token lexer\n     * \u003cp/\u003e\n     * Encapsulated tokens are surrounded by the given encapsulating-string.\n     * The encapsulator itself might be included in the token using a\n     * doubling syntax (as \"\", \u0027\u0027) or using escaping (as in \\\", \\\u0027).\n     * Whitespaces before and after an encapsulated token are ignored.\n     *\n     * @param tkn the current token\n     * @return a valid token object\n     * @throws IOException on invalid state\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 53)",
        "(line 193,col 9)-(line 193,col 14)",
        "(line 194,col 9)-(line 232,col 9)"
      ]
    }
  ]
}