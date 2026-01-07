{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/zip/X0015_CertificateIdForFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X0015_CertificateIdForFile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.PKWareExtraHeader",
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 43,
      "end_line": 186,
      "comment": "\n * X.509 Certificate ID and Signature for individual file (0x0015):\n *\n * This field contains the information about which certificate in the PKCS#7\n * store was used to sign a particular file. It also contains the signature\n * data. This field can appear multiple times, but can only appear once per\n * certificate.\n *\n * Note: all fields stored in Intel low-byte/high-byte order.\n *\n * \u003cpre\u003e\n *         Value     Size     Description\n *         -----     ----     -----------\n * (CID)   0x0015    2 bytes  Tag for this \"extra\" block type\n *         TSize     2 bytes  Size of data that follows\n *         RCount    4 bytes  Number of recipients. (inferred)\n *         HashAlg   2 bytes  Hash algorithm identifier. (inferred)\n *         TData     TSize    Signature Data\n * \u003c/pre\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.getHeaderId()",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Get the header id.\n     *\n     * @return the header id\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "localData"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Extra field data in local file data - without Header-ID or length\n     * specifier.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rcount"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashAlg"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.getRecordCount()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Get record count.\n     * @return\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.getHashAlgorithm()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Get hash algorithm.\n     * @return\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.setLocalFileDataData(byte[])",
      "begin_line": 88,
      "end_line": 90,
      "comment": "\n     * Set the extra field data in the local file data - without Header-ID or\n     * length specifier.\n     *\n     * @param data\n     *            the field data to use\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.getLocalFileDataLength()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * Get the length of the local data.\n     *\n     * @return the length of the local data\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.getLocalFileDataData()",
      "begin_line": 106,
      "end_line": 108,
      "comment": "\n     * Get the local data.\n     *\n     * @return the local data\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "centralData"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Extra field data in central directory - without Header-ID or length\n     * specifier.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.setCentralDirectoryData(byte[])",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Set the extra field data in central directory.\n     *\n     * @param data\n     *            the data to use\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.getCentralDirectoryLength()",
      "begin_line": 132,
      "end_line": 137,
      "comment": "\n     * Get the central data length. If there is no central data, get the local\n     * file data length.\n     *\n     * @return the central data length\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.getCentralDirectoryData()",
      "begin_line": 144,
      "end_line": 149,
      "comment": "\n     * Get the central data.\n     *\n     * @return the central data if present, else return the local file data\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 160,
      "end_line": 164,
      "comment": "\n     * @param data\n     *            the array of bytes.\n     * @param offset\n     *            the source location in the data array.\n     * @param length\n     *            the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromLocalFileData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 38)",
        "(line 162,col 9)-(line 162,col 55)",
        "(line 163,col 9)-(line 163,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 175,
      "end_line": 185,
      "comment": "\n     * @param data\n     *            the array of bytes.\n     * @param offset\n     *            the source location in the data array.\n     * @param length\n     *            the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromCentralDirectoryData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 38)",
        "(line 177,col 9)-(line 177,col 55)",
        "(line 178,col 9)-(line 178,col 37)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 54)",
        "(line 184,col 9)-(line 184,col 93)"
      ]
    }
  ]
}