{
  "filepath": "/tmp/Compress-9b/src/main/java/org/apache/commons/compress/archivers/zip/ZipExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipExtraField",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 92,
      "comment": "\n * General format of extra field data. \u003cp\u003e\n *\n * Extra fields usually appear twice per file, once in the local file data and\n * once in the central directory. Usually they are the same, but they don\u0027t have\n * to be. {@link java.util.zip.ZipOutputStream java.util.zip.ZipOutputStream}\n * will only use the local file data in both places.\u003c/p\u003e\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipExtraField.getHeaderId()",
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * The Header-ID.\n     *\n     * @return The HeaderId value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipExtraField.getLocalFileDataLength()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Length of the extra field in the local file data - without Header-ID or\n     * length specifier.\n     *\n     * @return The LocalFileDataLength value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipExtraField.getCentralDirectoryLength()",
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * Length of the extra field in the central directory - without Header-ID or\n     * length specifier.\n     *\n     * @return The CentralDirectoryLength value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipExtraField.getLocalFileDataData()",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * The actual data to put into local file data - without Header-ID or length\n     * specifier.\n     *\n     * @return The LocalFileDataData value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipExtraField.getCentralDirectoryData()",
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * The actual data to put into central directory - without Header-ID or\n     * length specifier.\n     *\n     * @return The CentralDirectoryData value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 79,
      "end_line": 80,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     *\n     * @param buffer the buffer to read data from\n     * @param offset offset into buffer to read data\n     * @param length the length of data\n     * @exception ZipException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 90,
      "end_line": 91,
      "comment": "\n     * Populate data from this array as if it was in central directory data.\n     *\n     * @param buffer the buffer to read data from\n     * @param offset offset into buffer to read data\n     * @param length the length of data\n     * @exception ZipException on error\n     ",
      "child_ranges": []
    }
  ]
}