{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/utils/ServiceLoaderIterator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ServiceLoaderIterator",
      "is_interface": false,
      "parent_types": [
        "java.util.Iterator\u003cE\u003e"
      ],
      "begin_line": 35,
      "end_line": 91,
      "comment": "\n * Iterates all services for a given class through the standard\n * {@link ServiceLoader} mechanism.\n * \n * @param \u003cE\u003e\n *            The service to load\n * @since 1.13\n "
    },
    {
      "type": "field",
      "varNames": [
        "nextServiceLoader"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "service"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serviceLoaderIterator"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.ServiceLoaderIterator.ServiceLoaderIterator(java.lang.Class\u003cE\u003e)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.ServiceLoaderIterator.ServiceLoaderIterator(java.lang.Class\u003cE\u003e, java.lang.ClassLoader)",
      "begin_line": 45,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 31)",
        "(line 47,col 9)-(line 47,col 88)",
        "(line 48,col 9)-(line 48,col 57)",
        "(line 49,col 9)-(line 49,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ServiceLoaderIterator.getNextServiceLoader()",
      "begin_line": 52,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ServiceLoaderIterator.hasNext()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ServiceLoaderIterator.next()",
      "begin_line": 76,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 45)",
        "(line 82,col 9)-(line 82,col 33)",
        "(line 83,col 9)-(line 83,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.ServiceLoaderIterator.remove()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 80)"
      ]
    }
  ]
}