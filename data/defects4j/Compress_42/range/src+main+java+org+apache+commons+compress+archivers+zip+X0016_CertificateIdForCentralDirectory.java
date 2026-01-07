{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/archivers/zip/X0016_CertificateIdForCentralDirectory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X0016_CertificateIdForCentralDirectory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.PKWareExtraHeader"
      ],
      "begin_line": 45,
      "end_line": 75,
      "comment": "\n * X.509 Certificate ID and Signature for central directory (0x0016).\n *\n * \u003cp\u003eThis field contains the information about which certificate in the PKCS#7\n * store was used to sign the central directory structure. When the Central\n * Directory Encryption feature is enabled for a ZIP file, this record will\n * appear in the Archive Extra Data Record, otherwise it will appear in the\n * first central directory record.\u003c/p\u003e\n *\n * \u003cp\u003eNote: all fields stored in Intel low-byte/high-byte order.\u003c/p\u003e\n *\n * \u003cpre\u003e\n *         Value     Size     Description\n *         -----     ----     -----------\n * (CDID)  0x0016    2 bytes  Tag for this \"extra\" block type\n *         TSize     2 bytes  Size of data that follows\n *         RCount    4 bytes  Number of recipients. (inferred)\n *         HashAlg   2 bytes  Hash algorithm identifier. (inferred)\n *         TData     TSize    Data\n * \u003c/pre\u003e\n *\n * @NotThreadSafe\n * @since 1.11\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.X0016_CertificateIdForCentralDirectory()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 36)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "rcount"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashAlg"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.getRecordCount()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * Get record count.\n     * @return the record count\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.getHashAlgorithm()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "\n     * Get hash algorithm.\n     * @return the hash algorithm\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 70,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 54)",
        "(line 73,col 9)-(line 73,col 93)"
      ]
    }
  ]
}