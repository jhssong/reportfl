{
  "filepath": "/tmp/Cli-40b/src/main/java/org/apache/commons/cli/TypeHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeHandler",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 261,
      "comment": "\n * This is a temporary implementation. TypeHandler will handle the\n * pluggableness of OptionTypes and it will direct all of these types\n * of conversion functionalities to ConvertUtils component in Commons\n * already. BeanUtils I think.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createValue(java.lang.String, java.lang.Object)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * Returns the \u003ccode\u003eObject\u003c/code\u003e of type \u003ccode\u003eobj\u003c/code\u003e\n     * with the value of \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the command line value\n     * @param obj the type of argument\n     * @return The instance of \u003ccode\u003eobj\u003c/code\u003e initialised with\n     * the value of \u003ccode\u003estr\u003c/code\u003e.\n     * @throws ParseException if the value creation for the given object type failed\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createValue(java.lang.String, java.lang.Class\u003cT\u003e)",
      "begin_line": 62,
      "end_line": 105,
      "comment": "\n     * Returns the \u003ccode\u003eObject\u003c/code\u003e of type \u003ccode\u003eclazz\u003c/code\u003e\n     * with the value of \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the command line value\n     * @param clazz the type of argument\n     * @return The instance of \u003ccode\u003eclazz\u003c/code\u003e initialised with\n     * the value of \u003ccode\u003estr\u003c/code\u003e.\n     * @throws ParseException if the value creation for the given class failed\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createObject(java.lang.String)",
      "begin_line": 114,
      "end_line": 135,
      "comment": "\n      * Create an Object from the classname and empty constructor.\n      *\n      * @param classname the argument value\n      * @return the initialised object\n      * @throws ParseException if the class could not be found or the object could not be created\n      ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 20)",
        "(line 118,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createNumber(java.lang.String)",
      "begin_line": 145,
      "end_line": 159,
      "comment": "\n     * Create a number from a String. If a . is present, it creates a\n     * Double, otherwise a Long.\n     *\n     * @param str the value\n     * @return the number represented by \u003ccode\u003estr\u003c/code\u003e\n     * @throws ParseException if \u003ccode\u003estr\u003c/code\u003e is not a number\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createClass(java.lang.String)",
      "begin_line": 168,
      "end_line": 178,
      "comment": "\n     * Returns the class whose name is \u003ccode\u003eclassname\u003c/code\u003e.\n     *\n     * @param classname the class name\n     * @return The class if it is found\n     * @throws ParseException if the class could not be found\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createDate(java.lang.String)",
      "begin_line": 191,
      "end_line": 194,
      "comment": "\n     * Returns the date represented by \u003ccode\u003estr\u003c/code\u003e.\n     * \u003cp\u003e\n     * This method is not yet implemented and always throws an\n     * {@link UnsupportedOperationException}.\n     *\n     * @param str the date string\n     * @return The date if \u003ccode\u003estr\u003c/code\u003e is a valid date string,\n     * otherwise return null.\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createURL(java.lang.String)",
      "begin_line": 203,
      "end_line": 213,
      "comment": "\n     * Returns the URL represented by \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the URL string\n     * @return The URL in \u003ccode\u003estr\u003c/code\u003e is well-formed\n     * @throws ParseException if the URL in \u003ccode\u003estr\u003c/code\u003e is not well-formed\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createFile(java.lang.String)",
      "begin_line": 221,
      "end_line": 224,
      "comment": "\n     * Returns the File represented by \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the File location\n     * @return The file represented by \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.openFile(java.lang.String)",
      "begin_line": 233,
      "end_line": 243,
      "comment": "\n     * Returns the opened FileInputStream represented by \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the file location\n     * @return The file input stream represented by \u003ccode\u003estr\u003c/code\u003e.\n     * @throws ParseException if the file is not exist or not readable\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createFiles(java.lang.String)",
      "begin_line": 255,
      "end_line": 260,
      "comment": "\n     * Returns the File[] represented by \u003ccode\u003estr\u003c/code\u003e.\n     * \u003cp\u003e\n     * This method is not yet implemented and always throws an\n     * {@link UnsupportedOperationException}.\n     *\n     * @param str the paths to the files\n     * @return The File[] represented by \u003ccode\u003estr\u003c/code\u003e.\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 71)"
      ]
    }
  ]
}