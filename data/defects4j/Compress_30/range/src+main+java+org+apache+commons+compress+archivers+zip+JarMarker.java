{
  "filepath": "/tmp/Compress-30b/src/main/java/org/apache/commons/compress/archivers/zip/JarMarker.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JarMarker",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 27,
      "end_line": 115,
      "comment": "\n * If this extra field is added as the very first extra field of the\n * archive, Solaris will consider it an executable jar file.\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "ID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NULL"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_BYTES"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.JarMarker()",
      "begin_line": 35,
      "end_line": 37,
      "comment": " No-arg constructor ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.getInstance()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Since JarMarker is stateless we can always use the same instance.\n     * @return the DEFAULT jarmaker.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.getHeaderId()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * The Header-ID.\n     * @return the header id\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.getLocalFileDataLength()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     * @return 0\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.getCentralDirectoryLength()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Length of the extra field in the central directory - without\n     * Header-ID or length specifier.\n     * @return 0\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.getLocalFileDataData()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * The actual data to put into local file data - without Header-ID\n     * or length specifier.\n     * @return the data\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.getCentralDirectoryData()",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * The actual data to put central directory - without Header-ID or\n     * length specifier.\n     * @return the data\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 99,
      "end_line": 104,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     * @param data an array of bytes\n     * @param offset the start offset\n     * @param length the number of bytes in the array from offset\n     *\n     * @throws ZipException on error\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.JarMarker.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "\n     * Doesn\u0027t do anything special since this class always uses the\n     * same data in central directory and local file data.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 55)"
      ]
    }
  ]
}