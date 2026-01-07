{
  "filepath": "/tmp/JxPath-9b/src/java/org/apache/commons/jxpath/ClassFunctions.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassFunctions",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Functions"
      ],
      "begin_line": 54,
      "end_line": 124,
      "comment": "\n * Extension functions provided by a Java class.\n *\n * Let\u0027s say, we declared a ClassFunction like this:\n * \u003cblockquote\u003e\u003cpre\u003e\n *     new ClassFunctions(Integer.class, \"int\")\n * \u003c/pre\u003e\u003c/blockquote\u003e\n *\n * We can now use XPaths like:\n * \u003cdl\u003e\n *  \u003cdt\u003e\u003ccode\u003e\"int:new(3)\"\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eEquivalent to \u003ccode\u003enew Integer(3)\u003c/code\u003e\u003c/dd\u003e\n *  \u003cdt\u003e\u003ccode\u003e\"int:getInteger(\u0027foo\u0027)\"\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eEquivalent to \u003ccode\u003eInteger.getInteger(\"foo\")\u003c/code\u003e\u003c/dd\u003e\n *  \u003cdt\u003e\u003ccode\u003e\"int:floatValue(int:new(4))\"\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eEquivalent to \u003ccode\u003enew Integer(4).floatValue()\u003c/code\u003e\u003c/dd\u003e\n * \u003c/dl\u003e\n *\n * \u003cp\u003e\n * If the first argument of a method is ExpressionContext, the\n * expression context in which the function is evaluated is passed to\n * the method.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "functionClass"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespace"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_ARRAY"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.ClassFunctions.ClassFunctions(java.lang.Class, java.lang.String)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 43)",
        "(line 61,col 9)-(line 61,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ClassFunctions.getUsedNamespaces()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Returns a set of one namespace - the one specified in the constructor.\n     *\n     * @return a singleton\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ClassFunctions.getFunction(java.lang.String, java.lang.String, java.lang.Object[])",
      "begin_line": 84,
      "end_line": 123,
      "comment": "\n     * Returns a Function, if any, for the specified namespace,\n     * name and parameter types.\n     *\n     * @param namespace if it is not the namespace specified in the constructor,\n     *     the method returns null\n     * @param name is a function name or \"new\" for a constructor.\n     *\n     * @return a MethodFunction, a ConstructorFunction or null if there is no\n     *      such function.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 95,col 9)",
        "(line 97,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 122,col 20)"
      ]
    }
  ]
}