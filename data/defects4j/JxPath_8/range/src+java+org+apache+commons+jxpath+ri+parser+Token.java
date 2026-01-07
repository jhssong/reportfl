{
  "filepath": "/tmp/JxPath-8b/src/java/org/apache/commons/jxpath/ri/parser/Token.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Token",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 8,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "kind"
      ],
      "begin_line": 15,
      "end_line": 15,
      "comment": "\n   * An integer that describes the kind of this token.  This numbering\n   * system is determined by JavaCCParser, and a table of these numbers is\n   * stored in the file ...Constants.java.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "beginLine",
        "beginColumn",
        "endLine",
        "endColumn"
      ],
      "begin_line": 22,
      "end_line": 22,
      "comment": "\n   * beginLine and beginColumn describe the position of the first character\n   * of this token; endLine and endColumn describe the position of the\n   * last character of this token.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "image"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": "\n   * The string image of the token.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n   * A reference to the next regular (non-special) token from the input\n   * stream.  If this is the last token from the input stream, or if the\n   * token manager has not read tokens beyond this one, this field is\n   * set to null.  This is true only if this token is also a regular\n   * token.  Otherwise, see below for a description of the contents of\n   * this field.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "specialToken"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n   * This field is used to access special tokens that occur prior to this\n   * token, but after the immediately preceding regular (non-special) token.\n   * If there are no such special tokens, this field is set to null.\n   * When there are more than one such special token, this field refers\n   * to the last of these special tokens, which in turn refers to the next\n   * previous special token through its specialToken field, and so on\n   * until the first special token (whose specialToken field is null).\n   * The next fields of special tokens refer to other special tokens that\n   * immediately follow it (without an intervening regular token).  If there\n   * is no such token, this field is null.\n   "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.Token.toString()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n   * Returns the image.\n   ",
      "child_ranges": [
        "(line 58,col 6)-(line 58,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.Token.newToken(int)",
      "begin_line": 73,
      "end_line": 79,
      "comment": "\n   * Returns a new Token object, by default. However, if you want, you\n   * can create and return subclass objects based on the value of ofKind.\n   * Simply add the cases to the switch for all those special cases.\n   * For example, if you have a subclass of Token called IDToken that\n   * you want to create if ofKind is ID, simlpy add something like :\n   *\n   *    case MyParserConstants.ID : return new IDToken();\n   *\n   * to the following switch statement. Then you can cast matchedToken\n   * variable to the appropriate type and use it in your lexical actions.\n   ",
      "child_ranges": [
        "(line 75,col 6)-(line 78,col 6)"
      ]
    }
  ]
}