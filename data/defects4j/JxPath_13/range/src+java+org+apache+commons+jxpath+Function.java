{
  "filepath": "/tmp/JxPath-13b/src/java/org/apache/commons/jxpath/Function.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Function",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 45,
      "comment": "\n * Extension function interface. Extension functions are grouped into\n * {@link Functions Functions} objects, which are installed on\n * JXPathContexts using the \n * {@link JXPathContext#setFunctions JXPathContext.setFunctions()}\n * call.\n * \u003cp\u003e\n * The Function interface can be implemented directly. However,\n * most of the time JXPath\u0027s built-in implementations should suffice.\n * See {@link ClassFunctions ClassFunctions} and \n * {@link PackageFunctions PackageFunctions}.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Function.invoke(org.apache.commons.jxpath.ExpressionContext, java.lang.Object[])",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Computes the value of the function. Each implementation of Function\n     * is responsible for conversion of supplied parameters to the required\n     * argument types.\n     *\n     * @param context can be used to acquire the context in which the\n     *    function is being evaluted.\n     ",
      "child_ranges": []
    }
  ]
}