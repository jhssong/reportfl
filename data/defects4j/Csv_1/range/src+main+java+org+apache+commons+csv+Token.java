{
  "filepath": "/tmp/Csv-1b/src/main/java/org/apache/commons/csv/Token.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Token",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 62,
      "comment": "\n * Token is an internal token representation.\n * \u003cp/\u003e\n * It is used as contract between the lexer and the parser.\n "
    },
    {
      "type": "field",
      "varNames": [
        "INITIAL_TOKEN_LENGTH"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " length of the initial token (content-)buffer "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " Token type "
    },
    {
      "type": "field",
      "varNames": [
        "content"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " The content buffer. "
    },
    {
      "type": "field",
      "varNames": [
        "isReady"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " Token ready flag: indicates a valid token with content (ready for the parser). "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.csv.Token.reset()",
      "begin_line": 56,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 29)",
        "(line 58,col 9)-(line 58,col 23)",
        "(line 59,col 9)-(line 59,col 24)",
        "(line 60,col 9)-(line 60,col 20)"
      ]
    }
  ]
}