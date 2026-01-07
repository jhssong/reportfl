{
  "filepath": "/tmp/JxPath-3b/src/java/org/apache/commons/jxpath/ExpressionContext.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ExpressionContext",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 73,
      "comment": "\n * If an extenstion function has an argument of type ExpressionContext,\n * it can gain access to the current node of an XPath expression context.\n * \u003cp\u003e\n * Example:\n * \u003cblockquote\u003e\u003cpre\u003e\n * public class MyExtenstionFunctions {\n *    public static String objectType(ExpressionContext context){\n *       Object value \u003d context.getContextNodePointer().getValue();\n *       if (value \u003d\u003d null){\n *           return \"null\";\n *       }\n *       return value.getClass().getName();\n *    }\n * }\n * \u003c/pre\u003e\u003c/blockquote\u003e\n *\n * You can then register this extension function using a {@link ClassFunctions\n * ClassFunctions} object and call it like this:\n * \u003cblockquote\u003e\u003cpre\u003e\n *   \"/descendent-or-self::node()[ns:objectType() \u003d \u0027java.util.Date\u0027]\"\n * \u003c/pre\u003e\u003c/blockquote\u003e\n * This expression will find all nodes of the graph that are dates.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ExpressionContext.getJXPathContext()",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Get the JXPathContext in which this function is being evaluated.\n     *\n     * @return A list representing the current context nodes.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ExpressionContext.getContextNodePointer()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Get the current context node.\n     *\n     * @return The current context node pointer.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ExpressionContext.getContextNodeList()",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Get the current context node list.  Each element of the list is\n     * a Pointer.\n     *\n     * @return A list representing the current context nodes.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.ExpressionContext.getPosition()",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Returns the current context position.\n     ",
      "child_ranges": []
    }
  ]
}