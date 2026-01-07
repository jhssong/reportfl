{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/zip/X0017_StrongEncryptionHeader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X0017_StrongEncryptionHeader",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.PKWareExtraHeader",
        "org.apache.commons.compress.archivers.zip.ZipExtraField"
      ],
      "begin_line": 244,
      "end_line": 482,
      "comment": "\n * Strong Encryption Header (0x0017)\n *\n * Certificate-based encryption:\n *\n * \u003cpre\u003e\n * Value     Size     Description\n * -----     ----     -----------\n * 0x0017    2 bytes  Tag for this \"extra\" block type\n * TSize     2 bytes  Size of data that follows\n * Format    2 bytes  Format definition for this record\n * AlgID     2 bytes  Encryption algorithm identifier\n * Bitlen    2 bytes  Bit length of encryption key (32-448 bits)\n * Flags     2 bytes  Processing flags\n * RCount    4 bytes  Number of recipients.\n * HashAlg   2 bytes  Hash algorithm identifier\n * HSize     2 bytes  Hash size\n * SRList    (var)    Simple list of recipients hashed public keys\n *\n * Flags -   This defines the processing flags.\n *\n *           \u003cul\u003e\n *           \u003cli\u003e0x0007 - reserved for future use\n *           \u003cli\u003e0x000F - reserved for future use\n *           \u003cli\u003e0x0100 - Indicates non-OAEP key wrapping was used.  If this\n *                        this field is set, the version needed to extract must\n *                        be at least 61.  This means OAEP key wrapping is not\n *                        used when generating a Master Session Key using\n *                        ErdData.\n *           \u003cli\u003e0x4000 - ErdData must be decrypted using 3DES-168, otherwise use the\n *                        same algorithm used for encrypting the file contents.\n *           \u003cli\u003e0x8000 - reserved for future use\n *           \u003c/ul\u003e\n *\n * RCount - This defines the number intended recipients whose\n *          public keys were used for encryption.  This identifies\n *          the number of elements in the SRList.\n *\n *          see also: reserved1\n *\n * HashAlg - This defines the hash algorithm used to calculate\n *           the public key hash of each public key used\n *           for encryption. This field currently supports\n *           only the following value for SHA-1\n *\n *           0x8004 - SHA1\n *\n * HSize -   This defines the size of a hashed public key.\n *\n * SRList -  This is a variable length list of the hashed\n *           public keys for each intended recipient.  Each\n *           element in this list is HSize.  The total size of\n *           SRList is determined using RCount * HSize.\n * \u003c/pre\u003e\n *\n * Password-based Extra Field 0x0017 in central header only.\n *\n * \u003cpre\u003e\n * Value     Size     Description\n * -----     ----     -----------\n * 0x0017    2 bytes  Tag for this \"extra\" block type\n * TSize     2 bytes  Size of data that follows\n * Format    2 bytes  Format definition for this record\n * AlgID     2 bytes  Encryption algorithm identifier\n * Bitlen    2 bytes  Bit length of encryption key (32-448 bits)\n * Flags     2 bytes  Processing flags\n * (more?)\n * \u003c/pre\u003e\n *\n * \u003cb\u003eFormat\u003c/b\u003e - the data format identifier for this record. The only value\n * allowed at this time is the integer value 2.\n *\n * Password-based Extra Field 0x0017 preceding compressed file data.\n *\n * \u003cpre\u003e\n * Value     Size     Description\n * -----     ----     -----------\n * 0x0017    2 bytes  Tag for this \"extra\" block type\n * IVSize    2 bytes  Size of initialization vector (IV)\n * IVData    IVSize   Initialization vector for this file\n * Size      4 bytes  Size of remaining decryption header data\n * Format    2 bytes  Format definition for this record\n * AlgID     2 bytes  Encryption algorithm identifier\n * Bitlen    2 bytes  Bit length of encryption key (32-448 bits)\n * Flags     2 bytes  Processing flags\n * ErdSize   2 bytes  Size of Encrypted Random Data\n * ErdData   ErdSize  Encrypted Random Data\n * Reserved1 4 bytes  Reserved certificate processing data\n * Reserved2 (var)    Reserved for certificate processing data\n * VSize     2 bytes  Size of password validation data\n * VData     VSize-4  Password validation data\n * VCRC32    4 bytes  Standard ZIP CRC32 of password validation data\n *\n * IVData - The size of the IV should match the algorithm block size.\n *          The IVData can be completely random data.  If the size of\n *          the randomly generated data does not match the block size\n *          it should be complemented with zero\u0027s or truncated as\n *          necessary.  If IVSize is 0,then IV \u003d CRC32 + Uncompressed\n *          File Size (as a 64 bit little-endian, unsigned integer value).\n *\n * Format -  the data format identifier for this record.  The only\n *           value allowed at this time is the integer value 2.\n *\n * ErdData - Encrypted random data is used to store random data that\n *           is used to generate a file session key for encrypting\n *           each file.  SHA1 is used to calculate hash data used to\n *           derive keys.  File session keys are derived from a master\n *           session key generated from the user-supplied password.\n *           If the Flags field in the decryption header contains\n *           the value 0x4000, then the ErdData field must be\n *           decrypted using 3DES. If the value 0x4000 is not set,\n *           then the ErdData field must be decrypted using AlgId.\n *\n * Reserved1 - Reserved for certificate processing, if value is\n *           zero, then Reserved2 data is absent.  See the explanation\n *           under the Certificate Processing Method for details on\n *           this data structure.\n *\n * Reserved2 - If present, the size of the Reserved2 data structure\n *           is located by skipping the first 4 bytes of this field\n *           and using the next 2 bytes as the remaining size.  See\n *           the explanation under the Certificate Processing Method\n *           for details on this data structure.\n *\n * VSize - This size value will always include the 4 bytes of the\n *         VCRC32 data and will be greater than 4 bytes.\n *\n * VData - Random data for password validation.  This data is VSize\n *         in length and VSize must be a multiple of the encryption\n *         block size.  VCRC32 is a checksum value of VData.\n *         VData and VCRC32 are stored encrypted and start the\n *         stream of encrypted data for a file.\n * \u003c/pre\u003e\n *\n *\n * Reserved1 - Certificate Decryption Header Reserved1 Data:\n *\n * \u003cpre\u003e\n * Value     Size     Description\n * -----     ----     -----------\n * RCount    4 bytes  Number of recipients.\n * \u003c/pre\u003e\n *\n * RCount - This defines the number intended recipients whose public keys were\n * used for encryption. This defines the number of elements in the REList field\n * defined below.\n *\n *\n * Reserved2 - Certificate Decryption Header Reserved2 Data Structures:\n *\n * \u003cpre\u003e\n * Value     Size     Description\n * -----     ----     -----------\n * HashAlg   2 bytes  Hash algorithm identifier\n * HSize     2 bytes  Hash size\n * REList    (var)    List of recipient data elements\n *\n * HashAlg - This defines the hash algorithm used to calculate\n *           the public key hash of each public key used\n *           for encryption. This field currently supports\n *           only the following value for SHA-1\n *\n *               0x8004 - SHA1\n *\n * HSize -   This defines the size of a hashed public key\n *           defined in REHData.\n *\n * REList -  This is a variable length of list of recipient data.\n *           Each element in this list consists of a Recipient\n *           Element data structure as follows:\n * \u003c/pre\u003e\n *\n * Recipient Element (REList) Data Structure:\n *\n * \u003cpre\u003e\n * Value     Size     Description\n * -----     ----     -----------\n * RESize    2 bytes  Size of REHData + REKData\n * REHData   HSize    Hash of recipients public key\n * REKData   (var)    Simple key blob\n *\n *\n * RESize -  This defines the size of an individual REList\n *           element.  This value is the combined size of the\n *           REHData field + REKData field.  REHData is defined by\n *           HSize.  REKData is variable and can be calculated\n *           for each REList element using RESize and HSize.\n *\n * REHData - Hashed public key for this recipient.\n *\n * REKData - Simple Key Blob.  The format of this data structure\n *           is identical to that defined in the Microsoft\n *           CryptoAPI and generated using the CryptExportKey()\n *           function.  The version of the Simple Key Blob\n *           supported at this time is 0x02 as defined by\n *           Microsoft.\n *\n *           For more details see https://msdn.microsoft.com/en-us/library/aa920051.aspx\n * \u003c/pre\u003e\n *\n * \u003cb\u003eFlags\u003c/b\u003e - Processing flags needed for decryption\n *\n * \u003cul\u003e\n * \u003cli\u003e0x0001 - Password is required to decrypt\u003c/li\u003e\n * \u003cli\u003e0x0002 - Certificates only\u003c/li\u003e\n * \u003cli\u003e0x0003 - Password or certificate required to decrypt\u003c/li\u003e\n * \u003cli\u003e0x0007 - reserved for future use\n * \u003cli\u003e0x000F - reserved for future use\n * \u003cli\u003e0x0100 - indicates non-OAEP key wrapping was used. If this field is set\n * the version needed to extract must be at least 61. This means OAEP key\n * wrapping is not used when generating a Master Session Key using ErdData.\n * \u003cli\u003e0x4000 - ErdData must be decrypted using 3DES-168, otherwise use the same\n * algorithm used for encrypting the file contents.\n * \u003cli\u003e0x8000 - reserved for future use.\n * \u003c/ul\u003e\n *\n * \u003cb\u003eSee the section describing the Strong Encryption Specification for\n * details. Refer to the section in this document entitled\n * \"Incorporating PKWARE Proprietary Technology into Your Product\" for more\n * information.\u003c/b\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.getHeaderId()",
      "begin_line": 253,
      "end_line": 255,
      "comment": "\n     * Get the header id.\n     *\n     * @return the header id\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "localData"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": "\n     * Extra field data in local file data - without Header-ID or length\n     * specifier.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "algId"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bitlen"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "flags"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "rcount"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashAlg"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashSize"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ivData"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": " encryption data"
    },
    {
      "type": "field",
      "varNames": [
        "erdData"
      ],
      "begin_line": 273,
      "end_line": 273,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recipientKeyHash"
      ],
      "begin_line": 276,
      "end_line": 276,
      "comment": " encryption key"
    },
    {
      "type": "field",
      "varNames": [
        "keyBlob"
      ],
      "begin_line": 277,
      "end_line": 277,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vData"
      ],
      "begin_line": 280,
      "end_line": 280,
      "comment": " password verification data"
    },
    {
      "type": "field",
      "varNames": [
        "vCRC32"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.getRecordCount()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "\n     * Get record count.\n     * @return\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.getHashAlgorithm()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\n     * Get hash algorithm.\n     * @return\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.getEncryptionAlgorithm()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * Get encryption algorithm.\n     * @return\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.setLocalFileDataData(byte[])",
      "begin_line": 314,
      "end_line": 316,
      "comment": "\n     * Set the extra field data in the local file data - without Header-ID or\n     * length specifier.\n     *\n     * @param data\n     *            the field data to use\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.getLocalFileDataLength()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "\n     * Get the length of the local data.\n     *\n     * @return the length of the local data\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.getLocalFileDataData()",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * Get the local data.\n     *\n     * @return the local data\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 39)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "centralData"
      ],
      "begin_line": 340,
      "end_line": 340,
      "comment": "\n     * Extra field data in central directory - without Header-ID or length\n     * specifier.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.setCentralDirectoryData(byte[])",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\n     * Set the extra field data in central directory.\n     *\n     * @param data\n     *            the data to use\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.getCentralDirectoryLength()",
      "begin_line": 358,
      "end_line": 363,
      "comment": "\n     * Get the central data length. If there is no central data, get the local\n     * file data length.\n     *\n     * @return the central data length\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.getCentralDirectoryData()",
      "begin_line": 370,
      "end_line": 375,
      "comment": "\n     * Get the central data.\n     *\n     * @return the central data if present, else return the local file data\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.parseCentralDirectoryFormat(byte[], int, int)",
      "begin_line": 384,
      "end_line": 401,
      "comment": "\n     * Parse central directory format.\n     *\n     * @param data\n     * @param offset\n     * @param length\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 54)",
        "(line 386,col 9)-(line 386,col 97)",
        "(line 387,col 9)-(line 387,col 58)",
        "(line 388,col 9)-(line 388,col 57)",
        "(line 389,col 9)-(line 389,col 57)",
        "(line 391,col 9)-(line 400,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.parseFileFormat(byte[], int, int)",
      "begin_line": 410,
      "end_line": 450,
      "comment": "\n     * Parse file header format. (Password only?)\n     *\n     * @param data\n     * @param offset\n     * @param length\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 53)",
        "(line 412,col 9)-(line 412,col 39)",
        "(line 413,col 9)-(line 413,col 67)",
        "(line 415,col 9)-(line 415,col 64)",
        "(line 416,col 9)-(line 416,col 67)",
        "(line 417,col 9)-(line 417,col 106)",
        "(line 418,col 9)-(line 418,col 68)",
        "(line 419,col 9)-(line 419,col 67)",
        "(line 421,col 9)-(line 421,col 68)",
        "(line 422,col 9)-(line 422,col 41)",
        "(line 423,col 9)-(line 423,col 79)",
        "(line 425,col 9)-(line 425,col 77)",
        "(line 426,col 9)-(line 426,col 48)",
        "(line 427,col 9)-(line 447,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 461,
      "end_line": 465,
      "comment": "\n     * @param data\n     *            the array of bytes.\n     * @param offset\n     *            the source location in the data array.\n     * @param length\n     *            the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromLocalFileData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 38)",
        "(line 463,col 9)-(line 463,col 55)",
        "(line 464,col 9)-(line 464,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 476,
      "end_line": 481,
      "comment": "\n     * @param data\n     *            the array of bytes.\n     * @param offset\n     *            the source location in the data array.\n     * @param length\n     *            the number of bytes to use in the data array.\n     * @see ZipExtraField#parseFromCentralDirectoryData(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 38)",
        "(line 478,col 9)-(line 478,col 55)",
        "(line 479,col 9)-(line 479,col 37)",
        "(line 480,col 9)-(line 480,col 58)"
      ]
    }
  ]
}