{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/zip/X0016_CertificateIdForCentralDirectory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X0016_CertificateIdForCentralDirectory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.PKWareExtraHeader",
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 44,
      "end_line": 186,
      "comment": "\n * X.509 Certificate ID and Signature for central directory (0x0016):\n *\n * This field contains the information about which certificate in the PKCS#7\n * store was used to sign the central directory structure. When the Central\n * Directory Encryption feature is enabled for a ZIP file, this record will\n * appear in the Archive Extra Data Record, otherwise it will appear in the\n * first central directory record.\n *\n * Note: all fields stored in Intel low-byte/high-byte order.\n *\n * \u003cpre\u003e\n *         Value     Size     Description\n *         -----     ----     -----------\n * (CDID)  0x0016    2 bytes  Tag for this \"extra\" block type\n *         TSize     2 bytes  Size of data that follows\n *         RCount    4 bytes  Number of recipients. (inferred)\n *         HashAlg   2 bytes  Hash algorithm identifier. (inferred)\n *         TData     TSize    Data\n * \u003c/pre\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.getHeaderId()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * Get the header id.\n     *\n     * @return the header id\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "localData"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Extra field data in local file data - without Header-ID or length\n     * specifier.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "rcount"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashAlg"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.getRecordCount()",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Get record count.\n     * @return\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.getHashAlgorithm()",
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Get hash algorithm.\n     * @return\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.setLocalFileDataData(byte[])",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * Set the extra field data in the local file data - without Header-ID or\n     * length specifier.\n     *\n     * @param data\n     *            the field data to use\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.getLocalFileDataLength()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Get the length of the local data.\n     *\n     * @return the length of the local data\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.getLocalFileDataData()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Get the local data.\n     *\n     * @return the local data\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "centralData"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Extra field data in central directory - without Header-ID or length\n     * specifier.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.setCentralDirectoryData(byte[])",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Set the extra field data in central directory.\n     *\n     * @param data\n     *            the data to use\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.getCentralDirectoryLength()",
      "begin_line": 133,
      "end_line": 138,
      "comment": "\n     * Get the central data length. If there is no central data, get the local\n     * file data length.\n     *\n     * @return the central data length\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.getCentralDirectoryData()",
      "begin_line": 145,
      "end_line": 150,
      "comment": "\n     * Get the central data.\n     *\n     * @return the central data if present, else return the local file data\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 163,
      "end_line": 167,
      "comment": "\n     * This should never be called for this header type.\n     *\n     * @param data\n     *            the array of bytes.\n     * @param offset\n     *            the source location in the data array.\n     * @param length\n     *            the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromLocalFileData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 38)",
        "(line 165,col 9)-(line 165,col 55)",
        "(line 166,col 9)-(line 166,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 178,
      "end_line": 185,
      "comment": "\n     * @param data\n     *            the array of bytes.\n     * @param offset\n     *            the source location in the data array.\n     * @param length\n     *            the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromCentralDirectoryData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 38)",
        "(line 180,col 9)-(line 180,col 55)",
        "(line 181,col 9)-(line 181,col 37)",
        "(line 183,col 9)-(line 183,col 54)",
        "(line 184,col 9)-(line 184,col 93)"
      ]
    }
  ]
}