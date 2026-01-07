{
  "filepath": "/tmp/JxPath-14b/src/java/org/apache/commons/jxpath/PackageFunctions.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PackageFunctions",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Functions"
      ],
      "begin_line": 71,
      "end_line": 212,
      "comment": "\n * Extension functions provided by Java classes.  The class prefix specified\n * in the constructor is used when a constructor or a static method is called.\n * Usually, a class prefix is a package name (hence the name of this class).\n *\n * Let\u0027s say, we declared a PackageFunction like this:\n * \u003cblockquote\u003e\u003cpre\u003e\n *     new PackageFunctions(\"java.util.\", \"util\")\n * \u003c/pre\u003e\u003c/blockquote\u003e\n *\n * We can now use XPaths like:\n * \u003cdl\u003e\n *  \u003cdt\u003e\u003ccode\u003e\"util:Date.new()\"\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eEquivalent to \u003ccode\u003enew java.util.Date()\u003c/code\u003e\u003c/dd\u003e\n *  \u003cdt\u003e\u003ccode\u003e\"util:Collections.singleton(\u0027foo\u0027)\"\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eEquivalent to \u003ccode\u003ejava.util.Collections.singleton(\"foo\")\u003c/code\u003e\u003c/dd\u003e\n *  \u003cdt\u003e\u003ccode\u003e\"util:substring(\u0027foo\u0027, 1, 2)\"\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eEquivalent to \u003ccode\u003e\"foo\".substring(1, 2)\u003c/code\u003e.  Note that in\n *  this case, the class prefix is not used. JXPath does not check that\n *  the first parameter of the function (the method target) is in fact\n *  a member of the package described by this PackageFunctions object.\u003c/dd\u003e\n * \u003c/dl\u003e\n *\n * \u003cp\u003e\n * If the first argument of a method or constructor is ExpressionContext, the\n * expression context in which the function is evaluated is passed to\n * the method.\n * \u003c/p\u003e\n * \u003cp\u003e\n * There is one PackageFunctions object registered by default with each\n * JXPathContext.  It does not have a namespace and uses no class prefix.\n * The existence of this object allows us to use XPaths like:\n * \u003ccode\u003e\"java.util.Date.new()\"\u003c/code\u003e and \u003ccode\u003e\"length(\u0027foo\u0027)\"\u003c/code\u003e\n * without the explicit registration of any extension functions.\n * \u003c/p\u003e\n\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "classPrefix"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "namespace"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_ARRAY"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.PackageFunctions.PackageFunctions(java.lang.String, java.lang.String)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 39)",
        "(line 78,col 9)-(line 78,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.PackageFunctions.getUsedNamespaces()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * Returns the namespace specified in the constructor\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.PackageFunctions.getFunction(java.lang.String, java.lang.String, java.lang.Object[])",
      "begin_line": 109,
      "end_line": 211,
      "comment": "\n     * Returns a Function, if any, for the specified namespace,\n     * name and parameter types.\n     * \u003cp\u003e\n     * @param  namespace - if it is not the same as specified in the\n     * construction, this method returns null\n     * @param name - name of the method, which can one these forms:\n     * \u003cul\u003e\n     * \u003cli\u003e\u003cb\u003emethodname\u003c/b\u003e, if invoking a method on an object passed as the\n     * first parameter\u003c/li\u003e\n     * \u003cli\u003e\u003cb\u003eClassname.new\u003c/b\u003e, if looking for a constructor\u003c/li\u003e\n     * \u003cli\u003e\u003cb\u003esubpackage.subpackage.Classname.new\u003c/b\u003e, if looking for a\n     * constructor in a subpackage\u003c/li\u003e\n     * \u003cli\u003e\u003cb\u003eClassname.methodname\u003c/b\u003e, if looking for a static method\u003c/li\u003e\n     * \u003cli\u003e\u003cb\u003esubpackage.subpackage.Classname.methodname\u003c/b\u003e, if looking for a\n     * static method of a class in a subpackage\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @return  a MethodFunction, a ConstructorFunction or null if no function\n     * is found\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 117,col 9)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 173,col 45)",
        "(line 174,col 9)-(line 174,col 44)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 179,col 54)",
        "(line 180,col 9)-(line 180,col 56)",
        "(line 182,col 9)-(line 182,col 28)",
        "(line 183,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 20)"
      ]
    }
  ]
}