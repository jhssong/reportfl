{
  "filepath": "/tmp/Lang-24b/src/main/java/org/apache/commons/lang3/EnumUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EnumUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 106,
      "comment": "\n * Utility library to provide helper methods for Java enums.\n * \n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.EnumUtils.EnumUtils()",
      "begin_line": 38,
      "end_line": 39,
      "comment": "\n     * This constructor is public to permit tools that require a JavaBean\n     * instance to operate.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.getEnumMap(java.lang.Class\u003cE\u003e)",
      "begin_line": 49,
      "end_line": 55,
      "comment": "\n     * Gets the \u003ccode\u003eMap\u003c/code\u003e of \u003ccode\u003eenums\u003c/code\u003e by name.\n     * \u003cp\u003e\n     * This method is useful when you need a map of enums by name.\n     *\n     * @param enumClass  the class of the \u003ccode\u003eenum\u003c/code\u003e to get, not null\n     * @return the modifiable map of enum names to enums, never null\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 60)",
        "(line 51,col 9)-(line 53,col 9)",
        "(line 54,col 9)-(line 54,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.getEnumList(java.lang.Class\u003cE\u003e)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Gets the \u003ccode\u003eList\u003c/code\u003e of \u003ccode\u003eenums\u003c/code\u003e.\n     * \u003cp\u003e\n     * This method is useful when you need a list of enums rather than an array.\n     *\n     * @param enumClass  the class of the \u003ccode\u003eenum\u003c/code\u003e to get, not null\n     * @return the modifiable list of enums, never null\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.isValidEnum(java.lang.Class\u003cE\u003e, java.lang.String)",
      "begin_line": 79,
      "end_line": 86,
      "comment": "\n     * Checks if the specified name is a valid \u003ccode\u003eenum\u003c/code\u003e for the class.\n     * \u003cp\u003e\n     * This method differs from {@link Enum#valueOf} in that checks if the name is\n     * a valid enum without needing to catch the exception.\n     *\n     * @param enumClass  the class of the \u003ccode\u003eenum\u003c/code\u003e to get, not null\n     * @param enumName   the enum name\n     * @return true if the enum name is valid, otherwise false\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 85,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.EnumUtils.getEnum(java.lang.Class\u003cE\u003e, java.lang.String)",
      "begin_line": 98,
      "end_line": 104,
      "comment": "\n     * Gets the \u003ccode\u003eenum\u003c/code\u003e for the class, returning \u003ccode\u003enull\u003c/code\u003e if not found.\n     * \u003cp\u003e\n     * This method differs from {@link Enum#valueOf} in that it does not throw an exception\n     * for an invalid enum name.\n     *\n     * @param enumClass  the class of the \u003ccode\u003eenum\u003c/code\u003e to get, not null\n     * @param enumName   the enum name\n     * @return the enum or null if not found\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 103,col 9)"
      ]
    }
  ]
}