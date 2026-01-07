{
  "filepath": "/tmp/Compress-32b/src/main/java/org/apache/commons/compress/archivers/sevenz/CoderBase.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CoderBase",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 85,
      "comment": "\n * Base Codec class.\n "
    },
    {
      "type": "field",
      "varNames": [
        "acceptableOptions"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NONE"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.CoderBase.CoderBase(java.lang.Class\u003c?\u003e...)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "\n     * @param acceptableOptions types that can be used as options for this codec.\n     ",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.CoderBase.canAcceptOptions(java.lang.Object)",
      "begin_line": 41,
      "end_line": 48,
      "comment": "\n     * @return whether this method can extract options from the given object.\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 46,col 9)",
        "(line 47,col 9)-(line 47,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.CoderBase.getOptionsAsProperties(java.lang.Object)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * @return property-bytes to write in a Folder block\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.CoderBase.getOptionsFromCoder(org.apache.commons.compress.archivers.sevenz.Coder, java.io.InputStream)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * @return configuration options that have been used to create the given InputStream from the given Coder\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.CoderBase.decode(java.lang.String, java.io.InputStream, long, org.apache.commons.compress.archivers.sevenz.Coder, byte[])",
      "begin_line": 67,
      "end_line": 69,
      "comment": "\n     * @return a stream that reads from in using the configured coder and password.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.CoderBase.encode(java.io.OutputStream, java.lang.Object)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * @return a stream that writes to out using the given configuration.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.CoderBase.numberOptionOrDefault(java.lang.Object, int)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * If the option represents a number, return its integer\n     * value, otherwise return the given default value.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 88)"
      ]
    }
  ]
}