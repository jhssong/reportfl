{
  "filepath": "/tmp/JxPath-5b/src/java/org/apache/commons/jxpath/ri/parser/TokenMgrError.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TokenMgrError",
      "is_interface": false,
      "parent_types": [
        "java.lang.Error"
      ],
      "begin_line": 7,
      "end_line": 153,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LEXICAL_ERROR"
      ],
      "begin_line": 16,
      "end_line": 16,
      "comment": "\n    * Lexical error occured.\n    "
    },
    {
      "type": "field",
      "varNames": [
        "STATIC_LEXER_ERROR"
      ],
      "begin_line": 21,
      "end_line": 21,
      "comment": "\n    * An attempt wass made to create a second instance of a static token manager.\n    "
    },
    {
      "type": "field",
      "varNames": [
        "INVALID_LEXICAL_STATE"
      ],
      "begin_line": 26,
      "end_line": 26,
      "comment": "\n    * Tried to change to an invalid lexical state.\n    "
    },
    {
      "type": "field",
      "varNames": [
        "LOOP_DETECTED"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": "\n    * Detected (and bailed out of) an infinite loop in the token manager.\n    "
    },
    {
      "type": "field",
      "varNames": [
        "errorCode"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n    * Indicates the reason why the exception is thrown. It will have\n    * one of the above 4 values.\n    "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.TokenMgrError.addEscapes(java.lang.String)",
      "begin_line": 43,
      "end_line": 86,
      "comment": "\n    * Replaces unprintable characters by their espaced (or unicode escaped)\n    * equivalents in the given string\n    ",
      "child_ranges": [
        "(line 44,col 7)-(line 44,col 47)",
        "(line 45,col 7)-(line 45,col 14)",
        "(line 46,col 7)-(line 84,col 7)",
        "(line 85,col 7)-(line 85,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.TokenMgrError.LexicalError(boolean, int, int, int, java.lang.String, char)",
      "begin_line": 100,
      "end_line": 106,
      "comment": "\n    * Returns a detailed message for the Error when it is thrown by the\n    * token manager to indicate a lexical error.\n    * Parameters : \n    *    EOFSeen     : indicates if EOF caused the lexicl error\n    *    curLexState : lexical state in which this error occured\n    *    errorLine   : line number when the error occured\n    *    errorColumn : column number when the error occured\n    *    errorAfter  : prefix that was seen before this error occured\n    *    curchar     : the offending character\n    * Note: You can customize the lexical error message by modifying this method.\n    ",
      "child_ranges": [
        "(line 101,col 7)-(line 105,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.TokenMgrError.getMessage()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n    * You can also modify the body of this method to customize your error messages.\n    * For example, cases like LOOP_DETECTED and INVALID_LEXICAL_STATE are not\n    * of end-users concern, so you can return something like : \n    *\n    *     \"Internal Error : Please file a bug report .... \"\n    *\n    * from this method for such cases in the release version of your parser.\n    ",
      "child_ranges": [
        "(line 118,col 7)-(line 118,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.parser.TokenMgrError.TokenMgrError()",
      "begin_line": 125,
      "end_line": 126,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.parser.TokenMgrError.TokenMgrError(java.lang.String, int)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 129,col 7)-(line 129,col 21)",
        "(line 130,col 7)-(line 130,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.parser.TokenMgrError.TokenMgrError(boolean, int, int, int, java.lang.String, char, int)",
      "begin_line": 133,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 134,col 7)-(line 134,col 97)",
        "(line 137,col 7)-(line 137,col 33)",
        "(line 138,col 7)-(line 138,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "position"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "character"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.TokenMgrError.getPosition()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 147,col 5)-(line 147,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.TokenMgrError.getCharacter()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 5)-(line 151,col 21)"
      ]
    }
  ]
}