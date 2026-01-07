{
  "filepath": "/tmp/Cli-24b/src/java/org/apache/commons/cli/TypeHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeHandler",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 246,
      "comment": "\n  * This is a temporary implementation. TypeHandler will handle the\n  * pluggableness of OptionTypes and it will direct all of these types\n  * of conversion functionalities to ConvertUtils component in Commons\n  * already. BeanUtils I think.\n  *\n  * @version $Revision$, $Date$\n  "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createValue(java.lang.String, java.lang.Object)",
      "begin_line": 46,
      "end_line": 50,
      "comment": "\n     * Returns the \u003ccode\u003eObject\u003c/code\u003e of type \u003ccode\u003eobj\u003c/code\u003e\n     * with the value of \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the command line value\n     * @param obj the type of argument\n     * @return The instance of \u003ccode\u003eobj\u003c/code\u003e initialised with\n     * the value of \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createValue(java.lang.String, java.lang.Class)",
      "begin_line": 61,
      "end_line": 104,
      "comment": "\n     * Returns the \u003ccode\u003eObject\u003c/code\u003e of type \u003ccode\u003eclazz\u003c/code\u003e\n     * with the value of \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the command line value\n     * @param clazz the type of argument\n     * @return The instance of \u003ccode\u003eclazz\u003c/code\u003e initialised with\n     * the value of \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createObject(java.lang.String)",
      "begin_line": 113,
      "end_line": 139,
      "comment": "\n      * Create an Object from the classname and empty constructor.\n      *\n      * @param classname the argument value\n      * @return the initialised object, or null if it couldn\u0027t create\n      * the Object.\n      ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 24)",
        "(line 118,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 31)",
        "(line 129,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 138,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createNumber(java.lang.String)",
      "begin_line": 149,
      "end_line": 167,
      "comment": "\n     * Create a number from a String. If a . is present, it creates a\n     * Double, otherwise a Long.\n     *\n     * @param str the value\n     * @return the number represented by \u003ccode\u003estr\u003c/code\u003e, if \u003ccode\u003estr\u003c/code\u003e\n     * is not a number, null is returned.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 166,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createClass(java.lang.String)",
      "begin_line": 175,
      "end_line": 186,
      "comment": "\n     * Returns the class whose name is \u003ccode\u003eclassname\u003c/code\u003e.\n     *\n     * @param classname the class name\n     * @return The class if it is found, otherwise return null\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createDate(java.lang.String)",
      "begin_line": 195,
      "end_line": 199,
      "comment": "\n     * Returns the date represented by \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the date string\n     * @return The date if \u003ccode\u003estr\u003c/code\u003e is a valid date string,\n     * otherwise return null.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createURL(java.lang.String)",
      "begin_line": 208,
      "end_line": 219,
      "comment": "\n     * Returns the URL represented by \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the URL string\n     * @return The URL is \u003ccode\u003estr\u003c/code\u003e is well-formed, otherwise\n     * return null.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createFile(java.lang.String)",
      "begin_line": 227,
      "end_line": 231,
      "comment": "\n     * Returns the File represented by \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the File location\n     * @return The file represented by \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createFiles(java.lang.String)",
      "begin_line": 239,
      "end_line": 245,
      "comment": "\n     * Returns the File[] represented by \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the paths to the files\n     * @return The File[] represented by \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 71)"
      ]
    }
  ]
}