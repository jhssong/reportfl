{
  "filepath": "/tmp/JxPath-15b/src/java/org/apache/commons/jxpath/CompiledExpression.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompiledExpression",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 117,
      "comment": "\n * Represents a compiled XPath. The interpretation of compiled XPaths\n * may be faster, because it bypasses the compilation step. The reference\n * implementation of JXPathContext also globally caches some of the\n * results of compilation, so the direct use of JXPathContext is not\n * always less efficient than the use of CompiledExpression.\n * \u003cp\u003e\n * Use CompiledExpression only when there is a need to evaluate the\n * same expression multiple times and the CompiledExpression can be\n * conveniently cached.\n * \u003cp\u003e\n * To acqure a CompiledExpression, call {@link JXPathContext#compile\n * JXPathContext.compile}\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.CompiledExpression.getValue(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Evaluates the xpath and returns the resulting object. Primitive\n     * types are wrapped into objects.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.CompiledExpression.getValue(org.apache.commons.jxpath.JXPathContext, java.lang.Class)",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Evaluates the xpath, converts the result to the specified class and\n     * returns the resulting object.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.CompiledExpression.setValue(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Modifies the value of the property described by the supplied xpath.\n     * Will throw an exception if one of the following conditions occurs:\n     * \u003cul\u003e\n     * \u003cli\u003eThe xpath does not in fact describe an existing property\n     * \u003cli\u003eThe property is not writable (no public, non-static set method)\n     * \u003c/ul\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.CompiledExpression.createPath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Creates intermediate elements of\n     * the path by invoking an AbstractFactory, which should first be\n     * installed on the context by calling \"setFactory\".\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.CompiledExpression.createPathAndSetValue(org.apache.commons.jxpath.JXPathContext, java.lang.Object)",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * The same as setValue, except it creates intermediate elements of\n     * the path by invoking an AbstractFactory, which should first be\n     * installed on the context by calling \"setFactory\".\n     * \u003cp\u003e\n     * Will throw an exception if one of the following conditions occurs:\n     * \u003cul\u003e\n     * \u003cli\u003eElements of the xpath aleady exist, by the path does not in\n     *  fact describe an existing property\n     * \u003cli\u003eThe AbstractFactory fails to create an instance for an intermediate\n     * element.\n     * \u003cli\u003eThe property is not writable (no public, non-static set method)\n     * \u003c/ul\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.CompiledExpression.iterate(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * Traverses the xpath and returns a Iterator of all results found\n     * for the path. If the xpath matches no properties\n     * in the graph, the Iterator will not be null.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.CompiledExpression.getPointer(org.apache.commons.jxpath.JXPathContext, java.lang.String)",
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Traverses the xpath and returns a Pointer.\n     * A Pointer provides easy access to a property.\n     * If the xpath matches no properties\n     * in the graph, the pointer will be null.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.CompiledExpression.iteratePointers(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Traverses the xpath and returns an Iterator of Pointers.\n     * A Pointer provides easy access to a property.\n     * If the xpath matches no properties\n     * in the graph, the Iterator be empty, but not null.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.CompiledExpression.removePath(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * Remove the graph element described by this expression\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.CompiledExpression.removeAll(org.apache.commons.jxpath.JXPathContext)",
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Remove all graph elements described by this expression\n     ",
      "child_ranges": []
    }
  ]
}