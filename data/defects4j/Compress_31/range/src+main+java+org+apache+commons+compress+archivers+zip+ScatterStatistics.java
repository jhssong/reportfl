{
  "filepath": "/tmp/Compress-31b/src/main/java/org/apache/commons/compress/archivers/zip/ScatterStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ScatterStatistics",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 56,
      "comment": "\n * Provides information about a scatter compression run.\n *\n * @since 1.10\n "
    },
    {
      "type": "field",
      "varNames": [
        "compressionElapsed"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mergingElapsed"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ScatterStatistics.ScatterStatistics(long, long)",
      "begin_line": 30,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 53)",
        "(line 32,col 9)-(line 32,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ScatterStatistics.getCompressionElapsed()",
      "begin_line": 39,
      "end_line": 41,
      "comment": "\n     * The number of milliseconds elapsed in the parallel compression phase\n     * @return The number of milliseconds elapsed\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ScatterStatistics.getMergingElapsed()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * The number of milliseconds elapsed in merging the results of the parallel compression, the IO phase\n     * @return The number of milliseconds elapsed\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ScatterStatistics.toString()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 106)"
      ]
    }
  ]
}