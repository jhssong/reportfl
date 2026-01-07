{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/archivers/zip/X0019_EncryptionRecipientCertificateList.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X0019_EncryptionRecipientCertificateList",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.PKWareExtraHeader"
      ],
      "begin_line": 51,
      "end_line": 57,
      "comment": "\n * PKCS#7 Encryption Recipient Certificate List (0x0019).\n *\n * \u003cp\u003eThis field MAY contain information about each of the certificates used in\n * encryption processing and it can be used to identify who is allowed to\n * decrypt encrypted files. This field should only appear in the archive extra\n * data record. This field is not required and serves only to aid archive\n * modifications by preserving public encryption key data. Individual security\n * requirements may dictate that this data be omitted to deter information\n * exposure.\u003c/p\u003e\n *\n * \u003cp\u003eNote: all fields stored in Intel low-byte/high-byte order.\u003c/p\u003e\n *\n * \u003cpre\u003e\n *          Value     Size     Description\n *          -----     ----     -----------\n * (CStore) 0x0019    2 bytes  Tag for this \"extra\" block type\n *          TSize     2 bytes  Size of the store data\n *          Version   2 bytes  Format version number - must 0x0001 at this time\n *          CStore    (var)    PKCS#7 data blob\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\u003cb\u003eSee the section describing the Strong Encryption Specification for\n * details. Refer to the section in this document entitled\n * \"Incorporating PKWARE Proprietary Technology into Your Product\" for more\n * information.\u003c/b\u003e\u003c/p\u003e\n *\n * @NotThreadSafe\n * @since 1.11\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.X0019_EncryptionRecipientCertificateList.X0019_EncryptionRecipientCertificateList()",
      "begin_line": 53,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 36)"
      ]
    }
  ]
}