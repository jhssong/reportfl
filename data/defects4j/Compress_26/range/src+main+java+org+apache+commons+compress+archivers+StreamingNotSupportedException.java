{
  "filepath": "/tmp/Compress-26b/src/main/java/org/apache/commons/compress/archivers/StreamingNotSupportedException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StreamingNotSupportedException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveException"
      ],
      "begin_line": 26,
      "end_line": 51,
      "comment": "\n * Exception thrown by ArchiveStreamFactory if a format is requested/detected that doesn\u0027t support streaming.\n * \n * @since 1.8\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.StreamingNotSupportedException.StreamingNotSupportedException(java.lang.String)",
      "begin_line": 37,
      "end_line": 40,
      "comment": "\n     * Creates a new StreamingNotSupportedException.\n     * \n     * @param format the format that has been requested/detected.\n     ",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 63)",
        "(line 39,col 9)-(line 39,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.StreamingNotSupportedException.getFormat()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Returns the format that has been requested/detected.\n     * \n     * @return the format that has been requested/detected.\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 22)"
      ]
    }
  ]
}