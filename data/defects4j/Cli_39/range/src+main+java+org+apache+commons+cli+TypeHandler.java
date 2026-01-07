{
  "filepath": "/tmp/Cli-39b/src/main/java/org/apache/commons/cli/TypeHandler.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TypeHandler",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 251,
      "comment": "\n * This is a temporary implementation. TypeHandler will handle the\n * pluggableness of OptionTypes and it will direct all of these types\n * of conversion functionalities to ConvertUtils component in Commons\n * already. BeanUtils I think.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createValue(java.lang.String, java.lang.Object)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Returns the \u003ccode\u003eObject\u003c/code\u003e of type \u003ccode\u003eobj\u003c/code\u003e\n     * with the value of \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the command line value\n     * @param obj the type of argument\n     * @return The instance of \u003ccode\u003eobj\u003c/code\u003e initialised with\n     * the value of \u003ccode\u003estr\u003c/code\u003e.\n     * @throws ParseException if the value creation for the given object type failed\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createValue(java.lang.String, java.lang.Class\u003c?\u003e)",
      "begin_line": 64,
      "end_line": 106,
      "comment": "\n     * Returns the \u003ccode\u003eObject\u003c/code\u003e of type \u003ccode\u003eclazz\u003c/code\u003e\n     * with the value of \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the command line value\n     * @param clazz the type of argument\n     * @return The instance of \u003ccode\u003eclazz\u003c/code\u003e initialised with\n     * the value of \u003ccode\u003estr\u003c/code\u003e.\n     * @throws ParseException if the value creation for the given class failed\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createObject(java.lang.String)",
      "begin_line": 115,
      "end_line": 136,
      "comment": "\n      * Create an Object from the classname and empty constructor.\n      *\n      * @param classname the argument value\n      * @return the initialised object\n      * @throws ParseException if the class could not be found or the object could not be created\n      ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 20)",
        "(line 119,col 9)-(line 126,col 9)",
        "(line 128,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createNumber(java.lang.String)",
      "begin_line": 146,
      "end_line": 160,
      "comment": "\n     * Create a number from a String. If a . is present, it creates a\n     * Double, otherwise a Long.\n     *\n     * @param str the value\n     * @return the number represented by \u003ccode\u003estr\u003c/code\u003e\n     * @throws ParseException if \u003ccode\u003estr\u003c/code\u003e is not a number\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createClass(java.lang.String)",
      "begin_line": 169,
      "end_line": 179,
      "comment": "\n     * Returns the class whose name is \u003ccode\u003eclassname\u003c/code\u003e.\n     *\n     * @param classname the class name\n     * @return The class if it is found\n     * @throws ParseException if the class could not be found\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createDate(java.lang.String)",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Returns the date represented by \u003ccode\u003estr\u003c/code\u003e.\n     * \u003cp\u003e\n     * This method is not yet implemented and always throws an\n     * {@link UnsupportedOperationException}.\n     *\n     * @param str the date string\n     * @return The date if \u003ccode\u003estr\u003c/code\u003e is a valid date string,\n     * otherwise return null.\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createURL(java.lang.String)",
      "begin_line": 204,
      "end_line": 214,
      "comment": "\n     * Returns the URL represented by \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the URL string\n     * @return The URL in \u003ccode\u003estr\u003c/code\u003e is well-formed\n     * @throws ParseException if the URL in \u003ccode\u003estr\u003c/code\u003e is not well-formed\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createFile(java.lang.String)",
      "begin_line": 222,
      "end_line": 225,
      "comment": "\n     * Returns the File represented by \u003ccode\u003estr\u003c/code\u003e.\n     *\n     * @param str the File location\n     * @return The file represented by \u003ccode\u003estr\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.TypeHandler.createFiles(java.lang.String)",
      "begin_line": 245,
      "end_line": 250,
      "comment": "\n     * Returns the File[] represented by \u003ccode\u003estr\u003c/code\u003e.\n     * \u003cp\u003e\n     * This method is not yet implemented and always throws an\n     * {@link UnsupportedOperationException}.\n     *\n     * @param str the paths to the files\n     * @return The File[] represented by \u003ccode\u003estr\u003c/code\u003e.\n     * @throws UnsupportedOperationException always\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 71)"
      ]
    }
  ]
}