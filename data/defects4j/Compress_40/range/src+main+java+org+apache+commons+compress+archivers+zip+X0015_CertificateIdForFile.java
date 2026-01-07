{
  "filepath": "/tmp/Compress-40b/src/main/java/org/apache/commons/compress/archivers/zip/X0015_CertificateIdForFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X0015_CertificateIdForFile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.PKWareExtraHeader"
      ],
      "begin_line": 44,
      "end_line": 75,
      "comment": "\n * X.509 Certificate ID and Signature for individual file (0x0015).\n *\n * \u003cp\u003eThis field contains the information about which certificate in the PKCS#7\n * store was used to sign a particular file. It also contains the signature\n * data. This field can appear multiple times, but can only appear once per\n * certificate.\u003c/p\u003e\n *\n * \u003cp\u003eNote: all fields stored in Intel low-byte/high-byte order.\u003c/p\u003e\n *\n * \u003cpre\u003e\n *         Value     Size     Description\n *         -----     ----     -----------\n * (CID)   0x0015    2 bytes  Tag for this \"extra\" block type\n *         TSize     2 bytes  Size of data that follows\n *         RCount    4 bytes  Number of recipients. (inferred)\n *         HashAlg   2 bytes  Hash algorithm identifier. (inferred)\n *         TData     TSize    Signature Data\n * \u003c/pre\u003e\n *\n * @NotThreadSafe\n * @since 1.11\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.X0015_CertificateIdForFile()",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 36)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "rcount"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashAlg"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.getRecordCount()",
      "begin_line": 57,
      "end_line": 59,
      "comment": "\n     * Get record count.\n     * @return the record count\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.getHashAlgorithm()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Get hash algorithm.\n     * @return the hash algorithm\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0015_CertificateIdForFile.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 69,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 66)",
        "(line 72,col 9)-(line 72,col 54)",
        "(line 73,col 9)-(line 73,col 93)"
      ]
    }
  ]
}