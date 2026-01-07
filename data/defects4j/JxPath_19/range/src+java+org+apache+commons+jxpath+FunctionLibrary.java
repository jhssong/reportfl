{
  "filepath": "/tmp/JxPath-19b/src/java/org/apache/commons/jxpath/FunctionLibrary.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionLibrary",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Functions"
      ],
      "begin_line": 34,
      "end_line": 132,
      "comment": "\n * An object that aggregates {@link Functions} objects into a group Functions\n * object. Since {@link JXPathContext} can only register a single Functions\n * object, FunctionLibrary should always be used to group all Functions objects\n * that need to be registered.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "allFunctions"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byNamespace"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.FunctionLibrary.addFunctions(org.apache.commons.jxpath.Functions)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Add functions to the library\n     * @param functions to add\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 36)",
        "(line 44,col 9)-(line 44,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.FunctionLibrary.removeFunctions(org.apache.commons.jxpath.Functions)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Remove functions from the library.\n     * @param functions to remove\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 39)",
        "(line 53,col 9)-(line 53,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.FunctionLibrary.getUsedNamespaces()",
      "begin_line": 61,
      "end_line": 66,
      "comment": "\n     * Returns a set containing all namespaces used by the aggregated\n     * Functions.\n     * @return Set\u003cString\u003e\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.FunctionLibrary.getFunction(java.lang.String, java.lang.String, java.lang.Object[])",
      "begin_line": 76,
      "end_line": 103,
      "comment": "\n     * Returns a Function, if any, for the specified namespace,\n     * name and parameter types.\n     * @param namespace function namespace\n     * @param name function name\n     * @param parameters parameters\n     * @return Function found\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 55)",
        "(line 82,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.FunctionLibrary.prepareCache()",
      "begin_line": 108,
      "end_line": 131,
      "comment": "\n     * Prepare the cache.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 36)",
        "(line 110,col 9)-(line 110,col 40)",
        "(line 111,col 9)-(line 130,col 9)"
      ]
    }
  ]
}