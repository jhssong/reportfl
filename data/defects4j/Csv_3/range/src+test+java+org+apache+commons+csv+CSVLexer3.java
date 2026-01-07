{
  "filepath": "/tmp/Csv-3b/src/test/java/org/apache/commons/csv/CSVLexer3.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CSVLexer3",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.csv.Lexer"
      ],
      "begin_line": 36,
      "end_line": 254,
      "comment": "\n * Experimental Lexer using enums to keep track of state and character type.\n * Unfortunately it is twice as slow.\n * For reference purpose only.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "escape"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.csv.CSVLexer3.CSVLexer3(org.apache.commons.csv.CSVFormat, org.apache.commons.csv.ExtendedBufferedReader)",
      "begin_line": 41,
      "end_line": 44,
      "comment": " ctor needs to be public so can be called dynamically by PerformanceTest class",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 26)",
        "(line 43,col 9)-(line 43,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer3.classify(int)",
      "begin_line": 60,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 66,col 9)",
        "(line 67,col 9)-(line 69,col 9)",
        "(line 70,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.CSVLexer3.nextToken(org.apache.commons.csv.Token)",
      "begin_line": 101,
      "end_line": 253,
      "comment": "\n     * Returns the next token.\n     * \u003cp/\u003e\n     * A token corresponds to a term, a record change or an end-of-file indicator.\n     *\n     * @param tkn an existing Token object to reuse. The caller is responsible to initialize the Token.\n     * @return the next token found\n     * @throws java.io.IOException on stream access error\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 34)",
        "(line 105,col 9)-(line 105,col 18)",
        "(line 106,col 9)-(line 106,col 43)",
        "(line 107,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 19)"
      ]
    }
  ]
}