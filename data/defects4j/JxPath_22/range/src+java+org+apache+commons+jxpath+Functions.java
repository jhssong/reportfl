{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/Functions.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Functions",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 49,
      "comment": "\n * A group of Function objects sharing a common namespace or a set of\n * common namespaces. Use the classes\n * {@link ClassFunctions ClassFunctions} and\n * {@link PackageFunctions PackageFunctions}\n * to register extension functions implemented as Java methods.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Functions.getUsedNamespaces()",
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Returns all namespaces in which this function collection defines\n     * functions.\n     * @return Set\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.Functions.getFunction(java.lang.String, java.lang.String, java.lang.Object[])",
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Returns a Function, if any, for the specified namespace,\n     * name and parameter types.\n     * @param namespace ns\n     * @param name function name\n     * @param parameters Object[]\n     * @return Function\n     ",
      "child_ranges": []
    }
  ]
}