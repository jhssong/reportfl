{
  "filepath": "/tmp/Csv-16b/src/main/java/org/apache/commons/csv/Token.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Token",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 73,
      "comment": "\n * Internal token representation.\n * \u003cp/\u003e\n * It is used as contract between the lexer and the parser.\n "
    },
    {
      "type": "field",
      "varNames": [
        "INITIAL_TOKEN_LENGTH"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " length of the initial token (content-)buffer "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Token type "
    },
    {
      "type": "field",
      "varNames": [
        "content"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The content buffer. "
    },
    {
      "type": "field",
      "varNames": [
        "isReady"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " Token ready flag: indicates a valid token with content (ready for the parser). "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Token.reset()",
      "begin_line": 58,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 29)",
        "(line 60,col 9)-(line 60,col 23)",
        "(line 61,col 9)-(line 61,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Token.toString()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * Eases IDE debugging.\n     *\n     * @return a string helpful for debugging.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 61)"
      ]
    }
  ]
}