{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/FunctionLibrary.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "FunctionLibrary",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.jxpath.Functions"
      ],
      "begin_line": 35,
      "end_line": 128,
      "comment": "\n * An object that aggregates {@link Functions} objects into a group Functions\n * object. Since {@link JXPathContext} can only register a single Functions\n * object, FunctionLibrary should always be used to group all Functions objects\n * that need to be registered.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "allFunctions"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "byNamespace"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.FunctionLibrary.addFunctions(org.apache.commons.jxpath.Functions)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Add functions to the library\n     * @param functions to add\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 36)",
        "(line 45,col 9)-(line 45,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.FunctionLibrary.removeFunctions(org.apache.commons.jxpath.Functions)",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Remove functions from the library.\n     * @param functions to remove\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 39)",
        "(line 54,col 9)-(line 54,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.FunctionLibrary.getUsedNamespaces()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Returns a set containing all namespaces used by the aggregated\n     * Functions.\n     * @return Set\u003cString\u003e\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.FunctionLibrary.getFunction(java.lang.String, java.lang.String, java.lang.Object[])",
      "begin_line": 74,
      "end_line": 98,
      "comment": "\n     * Returns a Function, if any, for the specified namespace,\n     * name and parameter types.\n     * @param namespace function namespace\n     * @param name function name\n     * @param parameters parameters\n     * @return Function found\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 59)",
        "(line 77,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 96,col 9)",
        "(line 97,col 9)-(line 97,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.FunctionLibrary.functionCache()",
      "begin_line": 103,
      "end_line": 127,
      "comment": "\n     * Prepare the cache.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 125,col 9)",
        "(line 126,col 9)-(line 126,col 27)"
      ]
    }
  ]
}