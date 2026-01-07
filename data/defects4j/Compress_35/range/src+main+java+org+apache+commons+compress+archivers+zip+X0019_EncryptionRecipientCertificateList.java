{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/zip/X0019_EncryptionRecipientCertificateList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X0019_EncryptionRecipientCertificateList",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.PKWareExtraHeader",
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 50,
      "end_line": 171,
      "comment": "\n * PKCS#7 Encryption Recipient Certificate List (0x0019)\n *\n * This field MAY contain information about each of the certificates used in\n * encryption processing and it can be used to identify who is allowed to\n * decrypt encrypted files. This field should only appear in the archive extra\n * data record. This field is not required and serves only to aid archive\n * modifications by preserving public encryption key data. Individual security\n * requirements may dictate that this data be omitted to deter information\n * exposure.\n *\n * Note: all fields stored in Intel low-byte/high-byte order.\n *\n * \u003cpre\u003e\n *          Value     Size     Description\n *          -----     ----     -----------\n * (CStore) 0x0019    2 bytes  Tag for this \"extra\" block type\n *          TSize     2 bytes  Size of the store data\n *          Version   2 bytes  Format version number - must 0x0001 at this time\n *          CStore    (var)    PKCS#7 data blob\n * \u003c/pre\u003e\n *\n * \u003cb\u003eSee the section describing the Strong Encryption Specification for\n * details. Refer to the section in this document entitled\n * \"Incorporating PKWARE Proprietary Technology into Your Product\" for more\n * information.\u003c/b\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList.getHeaderId()",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Get the header id.\n     *\n     * @return the header id\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "localData"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Extra field data in local file data - without Header-ID or length\n     * specifier.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList.setLocalFileDataData(byte[])",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Set the extra field data in the local file data - without Header-ID or\n     * length specifier.\n     *\n     * @param data\n     *            the field data to use\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList.getLocalFileDataLength()",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Get the length of the local data.\n     *\n     * @return the length of the local data\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList.getLocalFileDataData()",
      "begin_line": 94,
      "end_line": 96,
      "comment": "\n     * Get the local data.\n     *\n     * @return the local data\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "centralData"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Extra field data in central directory - without Header-ID or length\n     * specifier.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList.setCentralDirectoryData(byte[])",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Set the extra field data in central directory.\n     *\n     * @param data\n     *            the data to use\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList.getCentralDirectoryLength()",
      "begin_line": 120,
      "end_line": 125,
      "comment": "\n     * Get the central data length. If there is no central data, get the local\n     * file data length.\n     *\n     * @return the central data length\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList.getCentralDirectoryData()",
      "begin_line": 132,
      "end_line": 137,
      "comment": "\n     * Get the central data.\n     *\n     * @return the central data if present, else return the local file data\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 148,
      "end_line": 152,
      "comment": "\n     * @param data\n     *            the array of bytes.\n     * @param offset\n     *            the source location in the data array.\n     * @param length\n     *            the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromLocalFileData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 38)",
        "(line 150,col 9)-(line 150,col 55)",
        "(line 151,col 9)-(line 151,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 163,
      "end_line": 170,
      "comment": "\n     * @param data\n     *            the array of bytes.\n     * @param offset\n     *            the source location in the data array.\n     * @param length\n     *            the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromCentralDirectoryData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 38)",
        "(line 165,col 9)-(line 165,col 55)",
        "(line 166,col 9)-(line 166,col 37)",
        "(line 167,col 9)-(line 169,col 9)"
      ]
    }
  ]
}