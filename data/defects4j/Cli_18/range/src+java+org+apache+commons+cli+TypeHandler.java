{
  "filepath": "/tmp/Cli-18b/src/java/org/apache/commons/cli/TypeHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeHandler",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 245,
      "comment": "\n  * This is a temporary implementation. TypeHandler will handle the \n  * pluggableness of OptionTypes and it will direct all of these types \n  * of conversion functionalities to ConvertUtils component in Commons \n  * alreayd. BeanUtils I think.\n  *\n  * @author Henri Yandell (bayard @ generationjava.com)\n  * @version $Revision$\n  "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createValue(java.lang.String, java.lang.Object)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Returns the \u003ccode\u003eObject\u003c/code\u003e of type \u003ccode\u003eobj\u003c/code\u003e\n     * with the value of \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the command line value\n     * @param obj the type of argument\n     * @return The instance of \u003ccode\u003eobj\u003c/code\u003e initialised with\n     * the value of \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createValue(java.lang.String, java.lang.Class)",
      "begin_line": 60,
      "end_line": 102,
      "comment": "\n     * Returns the \u003ccode\u003eObject\u003c/code\u003e of type \u003ccode\u003eclazz\u003c/code\u003e\n     * with the value of \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the command line value\n     * @param clazz the type of argument\n     * @return The instance of \u003ccode\u003eclazz\u003c/code\u003e initialised with\n     * the value of \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createObject(java.lang.String)",
      "begin_line": 111,
      "end_line": 138,
      "comment": "\n      * Create an Object from the classname and empty constructor.\n      *\n      * @param str the argument value\n      * @return the initialised object, or null if it couldn\u0027t create \n      * the Object.\n      ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 24)",
        "(line 115,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 31)",
        "(line 128,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 137,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createNumber(java.lang.String)",
      "begin_line": 148,
      "end_line": 167,
      "comment": "\n     * Create a number from a String. If a . is present, it creates a \n     * Double, otherwise a Long.\n     *\n     * @param str the value\n     * @return the number represented by \u003ccode\u003estr\u003c/code\u003e, if \u003ccode\u003estr\u003c/code\u003e\n     * is not a number, null is returned.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createClass(java.lang.String)",
      "begin_line": 175,
      "end_line": 187,
      "comment": "\n     * Returns the class whose name is \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the class name\n     * @return The class if it is found, otherwise return null\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createDate(java.lang.String)",
      "begin_line": 196,
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
      "end_line": 220,
      "comment": "\n     * Returns the URL represented by \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the URL string\n     * @return The URL is \u003ccode\u003estr\u003c/code\u003e is well-formed, otherwise\n     * return null.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createFile(java.lang.String)",
      "begin_line": 228,
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
      "end_line": 244,
      "comment": "\n     * Returns the File[] represented by \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the paths to the files\n     * @return The File[] represented by \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 20)"
      ]
    }
  ]
}