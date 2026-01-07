{
  "filepath": "/tmp/Csv-9b/src/main/java/org/apache/commons/csv/Token.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Token",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 75,
      "comment": "\n * Internal token representation.\n * \u003cp/\u003e\n * It is used as contract between the lexer and the parser.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "INITIAL_TOKEN_LENGTH"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " length of the initial token (content-)buffer "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Token type "
    },
    {
      "type": "field",
      "varNames": [
        "content"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The content buffer. "
    },
    {
      "type": "field",
      "varNames": [
        "isReady"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Token ready flag: indicates a valid token with content (ready for the parser). "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Token.reset()",
      "begin_line": 60,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 29)",
        "(line 62,col 9)-(line 62,col 23)",
        "(line 63,col 9)-(line 63,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Token.toString()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * Eases IDE debugging.\n     *\n     * @return a string helpful for debugging.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 61)"
      ]
    }
  ]
}