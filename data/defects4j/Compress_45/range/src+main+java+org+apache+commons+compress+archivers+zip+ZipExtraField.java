{
  "filepath": "/tmp/Compress-45b/src/main/java/org/apache/commons/compress/archivers/zip/ZipExtraField.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipExtraField",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 96,
      "comment": "\n * General format of extra field data.\n *\n * \u003cp\u003eExtra fields usually appear twice per file, once in the local\n * file data and once in the central directory.  Usually they are the\n * same, but they don\u0027t have to be.  {@link\n * java.util.zip.ZipOutputStream java.util.zip.ZipOutputStream} will\n * only use the local file data in both places.\u003c/p\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "EXTRAFIELD_HEADER_SIZE"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Size of an extra field field header (id + length).\n     * @since 1.14\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipExtraField.getHeaderId()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * The Header-ID.\n     *\n     * @return The HeaderId value\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipExtraField.getLocalFileDataLength()",
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     * @return the length of the field in the local file data\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipExtraField.getCentralDirectoryLength()",
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Length of the extra field in the central directory - without\n     * Header-ID or length specifier.\n     * @return the length of the field in the central directory\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipExtraField.getLocalFileDataData()",
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * The actual data to put into local file data - without Header-ID\n     * or length specifier.\n     * @return the data\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipExtraField.getCentralDirectoryData()",
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * The actual data to put into central directory - without Header-ID or\n     * length specifier.\n     * @return the data\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipExtraField.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 83,
      "end_line": 84,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     *\n     * @param buffer the buffer to read data from\n     * @param offset offset into buffer to read data\n     * @param length the length of data\n     * @throws ZipException on error\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipExtraField.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 94,
      "end_line": 95,
      "comment": "\n     * Populate data from this array as if it was in central directory data.\n     *\n     * @param buffer the buffer to read data from\n     * @param offset offset into buffer to read data\n     * @param length the length of data\n     * @throws ZipException on error\n     ",
      "child_ranges": []
    }
  ]
}