{
  "filepath": "/tmp/Csv-2b/src/main/java/org/apache/commons/csv/CSVLexer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVLexer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.csv.Lexer"
      ],
      "begin_line": 33,
      "end_line": 244,
      "comment": "\n *\n *\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVLexer.CSVLexer(org.apache.commons.csv.CSVFormat, org.apache.commons.csv.ExtendedBufferedReader)",
      "begin_line": 36,
      "end_line": 38,
      "comment": " INTERNAL API. ctor needs to be public so can be called dynamically by PerformanceTest class ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer.nextToken(org.apache.commons.csv.Token)",
      "begin_line": 51,
      "end_line": 128,
      "comment": "\n     * Returns the next token.\n     * \u003cp/\u003e\n     * A token corresponds to a term, a record change or an end-of-file indicator.\n     *\n     * @param token\n     *            an existing Token object to reuse. The caller is responsible to initialize the Token.\n     * @return the next token found\n     * @throws java.io.IOException\n     *             on stream access error\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 40)",
        "(line 58,col 9)-(line 58,col 26)",
        "(line 63,col 9)-(line 63,col 39)",
        "(line 66,col 9)-(line 79,col 9)",
        "(line 82,col 9)-(line 86,col 9)",
        "(line 88,col 9)-(line 93,col 9)",
        "(line 96,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer.parseSimpleToken(org.apache.commons.csv.Token, int)",
      "begin_line": 149,
      "end_line": 176,
      "comment": "\n     * Parses a simple token.\n     * \u003cp/\u003e\n     * Simple token are tokens which are not surrounded by encapsulators. A simple token might contain escaped\n     * delimiters (as \\, or \\;). The token is finished when one of the following conditions become true:\n     * \u003cul\u003e\n     * \u003cli\u003eend of line has been reached (EORECORD)\u003c/li\u003e\n     * \u003cli\u003eend of stream has been reached (EOF)\u003c/li\u003e\n     * \u003cli\u003ean unescaped delimiter has been reached (TOKEN)\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param tkn\n     *            the current token\n     * @param c\n     *            the current character\n     * @return the filled token\n     * @throws IOException\n     *             on stream access error\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer.parseEncapsulatedToken(org.apache.commons.csv.Token)",
      "begin_line": 198,
      "end_line": 242,
      "comment": "\n     * Parses an encapsulated token.\n     * \u003cp/\u003e\n     * Encapsulated tokens are surrounded by the given encapsulating-string. The encapsulator itself might be included\n     * in the token using a doubling syntax (as \"\", \u0027\u0027) or using escaping (as in \\\", \\\u0027). Whitespaces before and after\n     * an encapsulated token are ignored. The token is finished when one of the following conditions become true:\n     * \u003cul\u003e\n     * \u003cli\u003ean unescaped encapsulator has been reached, and is followed by optional whitespace then:\u003c/li\u003e\n     * \u003cul\u003e\n     * \u003cli\u003edelimiter (TOKEN)\u003c/li\u003e\n     * \u003cli\u003eend of line (EORECORD)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \u003cli\u003eend of stream has been reached (EOF)\u003c/li\u003e \u003c/ul\u003e\n     *\n     * @param tkn\n     *            the current token\n     * @return a valid token object\n     * @throws IOException\n     *             on invalid state: EOF before closing encapsulator or invalid character before delimiter or EOL\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 53)",
        "(line 201,col 9)-(line 201,col 14)",
        "(line 202,col 9)-(line 241,col 9)"
      ]
    }
  ]
}