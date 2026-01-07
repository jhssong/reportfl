{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/zip/JarMarker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JarMarker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 26,
      "end_line": 114,
      "comment": "\n * If this extra field is added as the very first extra field of the\n * archive, Solaris will consider it an executable jar file.\n "
    },
    {
      "type": "field",
      "varNames": [
        "ID"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NULL"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_BYTES"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.JarMarker()",
      "begin_line": 34,
      "end_line": 36,
      "comment": " No-arg constructor ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.getInstance()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Since JarMarker is stateless we can always use the same instance.\n     * @return the DEFAULT jarmaker.\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.getHeaderId()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * The Header-ID.\n     * @return the header id\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.getLocalFileDataLength()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     * @return 0\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.getCentralDirectoryLength()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Length of the extra field in the central directory - without\n     * Header-ID or length specifier.\n     * @return 0\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.getLocalFileDataData()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * The actual data to put into local file data - without Header-ID\n     * or length specifier.\n     * @return the data\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.getCentralDirectoryData()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * The actual data to put central directory - without Header-ID or\n     * length specifier.\n     * @return the data\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 98,
      "end_line": 103,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     * @param data an array of bytes\n     * @param offset the start offset\n     * @param length the number of bytes in the array from offset\n     *\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 102,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "\n     * Doesn\u0027t do anything special since this class always uses the\n     * same data in central directory and local file data.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 55)"
      ]
    }
  ]
}