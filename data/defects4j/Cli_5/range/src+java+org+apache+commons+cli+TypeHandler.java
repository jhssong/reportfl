{
  "filepath": "/tmp/Cli-5b/src/java/org/apache/commons/cli/TypeHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeHandler",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 258,
      "comment": "\n  * This is a temporary implementation. TypeHandler will handle the \n  * pluggableness of OptionTypes and it will direct all of these types \n  * of conversion functionalities to ConvertUtils component in Commons \n  * alreayd. BeanUtils I think.\n  *\n  * @author Henri Yandell (bayard @ generationjava.com)\n  * @version $Revision$\n  "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createValue(java.lang.String, java.lang.Object)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * \u003cp\u003eReturns the \u003ccode\u003eObject\u003c/code\u003e of type \u003ccode\u003eobj\u003c/code\u003e\n     * with the value of \u003ccode\u003estr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str the command line value\n     * @param obj the type of argument\n     * @return The instance of \u003ccode\u003eobj\u003c/code\u003e initialised with\n     * the value of \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createValue(java.lang.String, java.lang.Class)",
      "begin_line": 60,
      "end_line": 102,
      "comment": "\n     * \u003cp\u003eReturns the \u003ccode\u003eObject\u003c/code\u003e of type \u003ccode\u003eclazz\u003c/code\u003e\n     * with the value of \u003ccode\u003estr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str the command line value\n     * @param clazz the type of argument\n     * @return The instance of \u003ccode\u003eclazz\u003c/code\u003e initialised with\n     * the value of \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createObject(java.lang.String)",
      "begin_line": 111,
      "end_line": 148,
      "comment": "\n      * \u003cp\u003eCreate an Object from the classname and empty constructor.\u003c/p\u003e\n      *\n      * @param str the argument value\n      * @return the initialised object, or null if it couldn\u0027t create \n      * the Object.\n      ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 24)",
        "(line 115,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 31)",
        "(line 128,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createNumber(java.lang.String)",
      "begin_line": 158,
      "end_line": 180,
      "comment": "\n     * \u003cp\u003eCreate a number from a String. If a . is present, it creates a \n     *    Double, otherwise a Long. \u003c/p\u003e\n     *\n     * @param str the value\n     * @return the number represented by \u003ccode\u003estr\u003c/code\u003e, if \u003ccode\u003estr\u003c/code\u003e\n     * is not a number, null is returned.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 179,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createClass(java.lang.String)",
      "begin_line": 188,
      "end_line": 200,
      "comment": "\n     * \u003cp\u003eReturns the class whose name is \u003ccode\u003estr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str the class name\n     * @return The class if it is found, otherwise return null\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createDate(java.lang.String)",
      "begin_line": 209,
      "end_line": 212,
      "comment": "\n     * \u003cp\u003eReturns the date represented by \u003ccode\u003estr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str the date string\n     * @return The date if \u003ccode\u003estr\u003c/code\u003e is a valid date string,\n     * otherwise return null.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createURL(java.lang.String)",
      "begin_line": 221,
      "end_line": 233,
      "comment": "\n     * \u003cp\u003eReturns the URL represented by \u003ccode\u003estr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str the URL string\n     * @return The URL is \u003ccode\u003estr\u003c/code\u003e is well-formed, otherwise\n     * return null.\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createFile(java.lang.String)",
      "begin_line": 241,
      "end_line": 244,
      "comment": "\n     * \u003cp\u003eReturns the File represented by \u003ccode\u003estr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str the File location\n     * @return The file represented by \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createFiles(java.lang.String)",
      "begin_line": 252,
      "end_line": 257,
      "comment": "\n     * \u003cp\u003eReturns the File[] represented by \u003ccode\u003estr\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param str the paths to the files\n     * @return The File[] represented by \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 20)"
      ]
    }
  ]
}