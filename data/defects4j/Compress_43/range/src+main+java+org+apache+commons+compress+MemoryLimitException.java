{
  "filepath": "/tmp/Compress-43b/src/main/java/org/apache/commons/compress/MemoryLimitException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MemoryLimitException",
      "is_interface": false,
      "parent_types": [
        "java.io.IOException"
      ],
      "begin_line": 31,
      "end_line": 64,
      "comment": "\n * If a stream checks for estimated memory allocation, and the estimate\n * goes above the memory limit, this is thrown.  This can also be thrown\n * if a stream tries to allocate a byte array that is larger than\n * the allowable limit.\n *\n * @since 1.14\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "memoryNeededInKb"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "long instead of int to account for overflow for corrupt files"
    },
    {
      "type": "field",
      "varNames": [
        "memoryLimitInKb"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.MemoryLimitException.MemoryLimitException(long, int)",
      "begin_line": 39,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 63)",
        "(line 41,col 9)-(line 41,col 49)",
        "(line 42,col 9)-(line 42,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.MemoryLimitException.MemoryLimitException(long, int, java.lang.Exception)",
      "begin_line": 45,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 66)",
        "(line 47,col 9)-(line 47,col 49)",
        "(line 48,col 9)-(line 48,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.MemoryLimitException.getMemoryNeededInKb()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.MemoryLimitException.getMemoryLimitInKb()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.MemoryLimitException.buildMessage(long, int)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 62,col 84)"
      ]
    }
  ]
}