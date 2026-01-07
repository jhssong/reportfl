{
  "filepath": "/tmp/Cli-1b/src/java/org/apache/commons/cli/TypeHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeHandler",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 257,
      "comment": "\n  * This is a temporary implementation. TypeHandler will handle the \n  * pluggableness of OptionTypes and it will direct all of these types \n  * of conversion functionalities to ConvertUtils component in Commons \n  * alreayd. BeanUtils I think.\n  *\n  * @author Henri Yandell (bayard @ generationjava.com)\n  * @version $Revision$\n  "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createValue(java.lang.String, java.lang.Object)",
      "begin_line": 47,
      "end_line": 50,
      "comment": "\n     * \u003cp\u003eReturns the \u003ccode\u003eObject\u003c/code\u003e of type \u003ccode\u003eobj\u003c/code\u003e\n     * with the value of \u003ccode\u003estr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str the command line value\n     * @param obj the type of argument\n     * @return The instance of \u003ccode\u003eobj\u003c/code\u003e initialised with\n     * the value of \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createValue(java.lang.String, java.lang.Class)",
      "begin_line": 61,
      "end_line": 103,
      "comment": "\n     * \u003cp\u003eReturns the \u003ccode\u003eObject\u003c/code\u003e of type \u003ccode\u003eclazz\u003c/code\u003e\n     * with the value of \u003ccode\u003estr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str the command line value\n     * @param clazz the type of argument\n     * @return The instance of \u003ccode\u003eclazz\u003c/code\u003e initialised with\n     * the value of \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createObject(java.lang.String)",
      "begin_line": 112,
      "end_line": 149,
      "comment": "\n      * \u003cp\u003eCreate an Object from the classname and empty constructor.\u003c/p\u003e\n      *\n      * @param str the argument value\n      * @return the initialised object, or null if it couldn\u0027t create \n      * the Object.\n      ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 24)",
        "(line 116,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 31)",
        "(line 129,col 9)-(line 146,col 9)",
        "(line 148,col 9)-(line 148,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createNumber(java.lang.String)",
      "begin_line": 158,
      "end_line": 172,
      "comment": "\n     * \u003cp\u003eCreate a number from a String.\u003c/p\u003e\n     *\n     * @param str the value\n     * @return the number represented by \u003ccode\u003estr\u003c/code\u003e, if \u003ccode\u003estr\u003c/code\u003e\n     * is not a number, null is returned.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createClass(java.lang.String)",
      "begin_line": 180,
      "end_line": 192,
      "comment": "\n     * \u003cp\u003eReturns the class whose name is \u003ccode\u003estr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str the class name\n     * @return The class if it is found, otherwise return null\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 191,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createDate(java.lang.String)",
      "begin_line": 201,
      "end_line": 211,
      "comment": "\n     * \u003cp\u003eReturns the date represented by \u003ccode\u003estr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str the date string\n     * @return The date if \u003ccode\u003estr\u003c/code\u003e is a valid date string,\n     * otherwise return null.\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 25)",
        "(line 205,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createURL(java.lang.String)",
      "begin_line": 220,
      "end_line": 232,
      "comment": "\n     * \u003cp\u003eReturns the URL represented by \u003ccode\u003estr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str the URL string\n     * @return The URL is \u003ccode\u003estr\u003c/code\u003e is well-formed, otherwise\n     * return null.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createFile(java.lang.String)",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\n     * \u003cp\u003eReturns the File represented by \u003ccode\u003estr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str the File location\n     * @return The file represented by \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createFiles(java.lang.String)",
      "begin_line": 251,
      "end_line": 256,
      "comment": "\n     * \u003cp\u003eReturns the File[] represented by \u003ccode\u003estr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str the paths to the files\n     * @return The File[] represented by \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 20)"
      ]
    }
  ]
}