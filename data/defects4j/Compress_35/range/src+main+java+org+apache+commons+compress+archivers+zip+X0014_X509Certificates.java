{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/zip/X0014_X509Certificates.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X0014_X509Certificates",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.PKWareExtraHeader",
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 42,
      "end_line": 163,
      "comment": "\n * PKCS#7 Store for X.509 Certificates (0x0014):\n *\n * This field MUST contain information about each of the certificates files may\n * be signed with. When the Central Directory Encryption feature is enabled for\n * a ZIP file, this record will appear in the Archive Extra Data Record,\n * otherwise it will appear in the first central directory record and will be\n * ignored in any other record.\n *\n * Note: all fields stored in Intel low-byte/high-byte order.\n *\n * \u003cpre\u003e\n *         Value     Size     Description\n *         -----     ----     -----------\n * (Store) 0x0014    2 bytes  Tag for this \"extra\" block type\n *         TSize     2 bytes  Size of the store data\n *         TData     TSize    Data about the store\n * \u003c/pre\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0014_X509Certificates.getHeaderId()",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Get the header id.\n     *\n     * @return the header id\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "localData"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Extra field data in local file data - without Header-ID or length\n     * specifier.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0014_X509Certificates.setLocalFileDataData(byte[])",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Set the extra field data in the local file data - without Header-ID or\n     * length specifier.\n     *\n     * @param data\n     *            the field data to use\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0014_X509Certificates.getLocalFileDataLength()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Get the length of the local data.\n     *\n     * @return the length of the local data\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0014_X509Certificates.getLocalFileDataData()",
      "begin_line": 86,
      "end_line": 88,
      "comment": "\n     * Get the local data.\n     *\n     * @return the local data\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "centralData"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Extra field data in central directory - without Header-ID or length\n     * specifier.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0014_X509Certificates.setCentralDirectoryData(byte[])",
      "begin_line": 102,
      "end_line": 104,
      "comment": "\n     * Set the extra field data in central directory.\n     *\n     * @param data\n     *            the data to use\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0014_X509Certificates.getCentralDirectoryLength()",
      "begin_line": 112,
      "end_line": 117,
      "comment": "\n     * Get the central data length. If there is no central data, get the local\n     * file data length.\n     *\n     * @return the central data length\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0014_X509Certificates.getCentralDirectoryData()",
      "begin_line": 124,
      "end_line": 129,
      "comment": "\n     * Get the central data.\n     *\n     * @return the central data if present, else return the local file data\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0014_X509Certificates.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 140,
      "end_line": 144,
      "comment": "\n     * @param data\n     *            the array of bytes.\n     * @param offset\n     *            the source location in the data array.\n     * @param length\n     *            the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromLocalFileData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 38)",
        "(line 142,col 9)-(line 142,col 55)",
        "(line 143,col 9)-(line 143,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0014_X509Certificates.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 155,
      "end_line": 162,
      "comment": "\n     * @param data\n     *            the array of bytes.\n     * @param offset\n     *            the source location in the data array.\n     * @param length\n     *            the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromCentralDirectoryData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 38)",
        "(line 157,col 9)-(line 157,col 55)",
        "(line 158,col 9)-(line 158,col 37)",
        "(line 159,col 9)-(line 161,col 9)"
      ]
    }
  ]
}