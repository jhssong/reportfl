{
  "filepath": "/tmp/JxPath-18b/src/java/org/apache/commons/jxpath/ri/parser/ParseException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParseException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 13,
      "end_line": 192,
      "comment": "\n * This exception is thrown when parse errors are encountered.\n * You can explicitly create objects of this exception type by\n * calling the method generateParseException in the generated\n * parser.\n *\n * You can modify this class to customize your error reporting\n * mechanisms so long as you retain the public fields.\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.parser.ParseException.ParseException(org.apache.commons.jxpath.ri.parser.Token, int[][], java.lang.String[])",
      "begin_line": 27,
      "end_line": 37,
      "comment": "\n   * This constructor is used by the method \"generateParseException\"\n   * in the generated parser.  Calling this constructor generates\n   * a new object of this type with the fields \"currentToken\",\n   * \"expectedTokenSequences\", and \"tokenImage\" set.  The boolean\n   * flag \"specialConstructor\" is also set to true to indicate that\n   * this constructor was used to create this object.\n   * This constructor calls its super class with the empty string\n   * to force the \"toString\" method of parent class \"Throwable\" to\n   * print the error message in the form:\n   *     ParseException: \u003cresult of getMessage\u003e\n   ",
      "child_ranges": [
        "(line 32,col 5)-(line 32,col 14)",
        "(line 33,col 5)-(line 33,col 30)",
        "(line 34,col 5)-(line 34,col 35)",
        "(line 35,col 5)-(line 35,col 55)",
        "(line 36,col 5)-(line 36,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.parser.ParseException.ParseException()",
      "begin_line": 49,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 12)",
        "(line 51,col 5)-(line 51,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ri.parser.ParseException.ParseException(java.lang.String)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 55,col 5)-(line 55,col 19)",
        "(line 56,col 5)-(line 56,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "specialConstructor"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n   * This variable determines which constructor was used to create\n   * this object and thereby affects the semantics of the\n   * \"getMessage\" method (see below).\n   "
    },
    {
      "type": "field",
      "varNames": [
        "currentToken"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n   * This is the last token that has been consumed successfully.  If\n   * this object has been created due to a parse error, the token\n   * followng this token will (therefore) be the first error token.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "expectedTokenSequences"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n   * Each entry in this array is an array of integers.  Each array\n   * of integers represents a sequence of tokens (by their ordinal\n   * values) that is expected at this point of the parse.\n   "
    },
    {
      "type": "field",
      "varNames": [
        "tokenImage"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n   * This is a reference to the \"tokenImage\" array of the generated\n   * parser within which the parse error occurred.  This array is\n   * defined in the generated ...Constants interface.\n   "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.ParseException.getMessage()",
      "begin_line": 97,
      "end_line": 135,
      "comment": "\n   * This method has the standard behavior when this object has been\n   * created using the standard constructors.  Otherwise, it uses\n   * \"currentToken\" and \"expectedTokenSequences\" to generate a parse\n   * error message and returns it.  If this object has been created\n   * due to a parse error, and you do not catch it (it gets thrown\n   * from the parser), then this method is called during the printing\n   * of the final stack trace, and hence the correct error message\n   * gets displayed.\n   ",
      "child_ranges": [
        "(line 98,col 5)-(line 100,col 5)",
        "(line 101,col 5)-(line 101,col 25)",
        "(line 102,col 5)-(line 102,col 20)",
        "(line 103,col 5)-(line 114,col 5)",
        "(line 115,col 5)-(line 115,col 37)",
        "(line 116,col 5)-(line 116,col 34)",
        "(line 117,col 5)-(line 125,col 5)",
        "(line 126,col 5)-(line 126,col 104)",
        "(line 127,col 5)-(line 127,col 24)",
        "(line 128,col 5)-(line 132,col 5)",
        "(line 133,col 5)-(line 133,col 23)",
        "(line 134,col 5)-(line 134,col 18)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "eol"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n   * The end of line string for this machine.\n   "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ri.parser.ParseException.add_escapes(java.lang.String)",
      "begin_line": 147,
      "end_line": 190,
      "comment": "\n   * Used to convert raw characters to their escaped version\n   * when these raw version cannot be used as part of an ASCII\n   * string literal.\n   ",
      "child_ranges": [
        "(line 148,col 7)-(line 148,col 47)",
        "(line 149,col 7)-(line 149,col 14)",
        "(line 150,col 7)-(line 188,col 7)",
        "(line 189,col 7)-(line 189,col 31)"
      ]
    }
  ]
}