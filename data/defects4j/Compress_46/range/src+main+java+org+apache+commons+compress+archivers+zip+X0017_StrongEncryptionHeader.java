{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/archivers/zip/X0017_StrongEncryptionHeader.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X0017_StrongEncryptionHeader",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.PKWareExtraHeader"
      ],
      "begin_line": 245,
      "end_line": 382,
      "comment": "\n * Strong Encryption Header (0x0017).\n *\n * \u003cp\u003eCertificate-based encryption:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * Value     Size     Description\n * -----     ----     -----------\n * 0x0017    2 bytes  Tag for this \"extra\" block type\n * TSize     2 bytes  Size of data that follows\n * Format    2 bytes  Format definition for this record\n * AlgID     2 bytes  Encryption algorithm identifier\n * Bitlen    2 bytes  Bit length of encryption key (32-448 bits)\n * Flags     2 bytes  Processing flags\n * RCount    4 bytes  Number of recipients.\n * HashAlg   2 bytes  Hash algorithm identifier\n * HSize     2 bytes  Hash size\n * SRList    (var)    Simple list of recipients hashed public keys\n *\n * Flags -   This defines the processing flags.\n * \u003c/pre\u003e\n *\n *           \u003cul\u003e\n *           \u003cli\u003e0x0007 - reserved for future use\n *           \u003cli\u003e0x000F - reserved for future use\n *           \u003cli\u003e0x0100 - Indicates non-OAEP key wrapping was used.  If this\n *                        this field is set, the version needed to extract must\n *                        be at least 61.  This means OAEP key wrapping is not\n *                        used when generating a Master Session Key using\n *                        ErdData.\n *           \u003cli\u003e0x4000 - ErdData must be decrypted using 3DES-168, otherwise use the\n *                        same algorithm used for encrypting the file contents.\n *           \u003cli\u003e0x8000 - reserved for future use\n *           \u003c/ul\u003e\n *\n * \u003cpre\u003e\n * RCount - This defines the number intended recipients whose\n *          public keys were used for encryption.  This identifies\n *          the number of elements in the SRList.\n *\n *          see also: reserved1\n *\n * HashAlg - This defines the hash algorithm used to calculate\n *           the public key hash of each public key used\n *           for encryption. This field currently supports\n *           only the following value for SHA-1\n *\n *           0x8004 - SHA1\n *\n * HSize -   This defines the size of a hashed public key.\n *\n * SRList -  This is a variable length list of the hashed\n *           public keys for each intended recipient.  Each\n *           element in this list is HSize.  The total size of\n *           SRList is determined using RCount * HSize.\n * \u003c/pre\u003e\n *\n * \u003cp\u003ePassword-based Extra Field 0x0017 in central header only.\u003c/p\u003e\n *\n * \u003cpre\u003e\n * Value     Size     Description\n * -----     ----     -----------\n * 0x0017    2 bytes  Tag for this \"extra\" block type\n * TSize     2 bytes  Size of data that follows\n * Format    2 bytes  Format definition for this record\n * AlgID     2 bytes  Encryption algorithm identifier\n * Bitlen    2 bytes  Bit length of encryption key (32-448 bits)\n * Flags     2 bytes  Processing flags\n * (more?)\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\u003cb\u003eFormat\u003c/b\u003e - the data format identifier for this record. The only value\n * allowed at this time is the integer value 2.\u003c/p\u003e\n *\n * \u003cp\u003ePassword-based Extra Field 0x0017 preceding compressed file data.\u003c/p\u003e\n *\n * \u003cpre\u003e\n * Value     Size     Description\n * -----     ----     -----------\n * 0x0017    2 bytes  Tag for this \"extra\" block type\n * IVSize    2 bytes  Size of initialization vector (IV)\n * IVData    IVSize   Initialization vector for this file\n * Size      4 bytes  Size of remaining decryption header data\n * Format    2 bytes  Format definition for this record\n * AlgID     2 bytes  Encryption algorithm identifier\n * Bitlen    2 bytes  Bit length of encryption key (32-448 bits)\n * Flags     2 bytes  Processing flags\n * ErdSize   2 bytes  Size of Encrypted Random Data\n * ErdData   ErdSize  Encrypted Random Data\n * Reserved1 4 bytes  Reserved certificate processing data\n * Reserved2 (var)    Reserved for certificate processing data\n * VSize     2 bytes  Size of password validation data\n * VData     VSize-4  Password validation data\n * VCRC32    4 bytes  Standard ZIP CRC32 of password validation data\n *\n * IVData - The size of the IV should match the algorithm block size.\n *          The IVData can be completely random data.  If the size of\n *          the randomly generated data does not match the block size\n *          it should be complemented with zero\u0027s or truncated as\n *          necessary.  If IVSize is 0,then IV \u003d CRC32 + Uncompressed\n *          File Size (as a 64 bit little-endian, unsigned integer value).\n *\n * Format -  the data format identifier for this record.  The only\n *           value allowed at this time is the integer value 2.\n *\n * ErdData - Encrypted random data is used to store random data that\n *           is used to generate a file session key for encrypting\n *           each file.  SHA1 is used to calculate hash data used to\n *           derive keys.  File session keys are derived from a master\n *           session key generated from the user-supplied password.\n *           If the Flags field in the decryption header contains\n *           the value 0x4000, then the ErdData field must be\n *           decrypted using 3DES. If the value 0x4000 is not set,\n *           then the ErdData field must be decrypted using AlgId.\n *\n * Reserved1 - Reserved for certificate processing, if value is\n *           zero, then Reserved2 data is absent.  See the explanation\n *           under the Certificate Processing Method for details on\n *           this data structure.\n *\n * Reserved2 - If present, the size of the Reserved2 data structure\n *           is located by skipping the first 4 bytes of this field\n *           and using the next 2 bytes as the remaining size.  See\n *           the explanation under the Certificate Processing Method\n *           for details on this data structure.\n *\n * VSize - This size value will always include the 4 bytes of the\n *         VCRC32 data and will be greater than 4 bytes.\n *\n * VData - Random data for password validation.  This data is VSize\n *         in length and VSize must be a multiple of the encryption\n *         block size.  VCRC32 is a checksum value of VData.\n *         VData and VCRC32 are stored encrypted and start the\n *         stream of encrypted data for a file.\n * \u003c/pre\u003e\n *\n * \u003cp\u003eReserved1 - Certificate Decryption Header Reserved1 Data:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * Value     Size     Description\n * -----     ----     -----------\n * RCount    4 bytes  Number of recipients.\n * \u003c/pre\u003e\n *\n * \u003cp\u003eRCount - This defines the number intended recipients whose public keys were\n * used for encryption. This defines the number of elements in the REList field\n * defined below.\u003c/p\u003e\n *\n * \u003cp\u003eReserved2 - Certificate Decryption Header Reserved2 Data Structures:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * Value     Size     Description\n * -----     ----     -----------\n * HashAlg   2 bytes  Hash algorithm identifier\n * HSize     2 bytes  Hash size\n * REList    (var)    List of recipient data elements\n *\n * HashAlg - This defines the hash algorithm used to calculate\n *           the public key hash of each public key used\n *           for encryption. This field currently supports\n *           only the following value for SHA-1\n *\n *               0x8004 - SHA1\n *\n * HSize -   This defines the size of a hashed public key\n *           defined in REHData.\n *\n * REList -  This is a variable length of list of recipient data.\n *           Each element in this list consists of a Recipient\n *           Element data structure as follows:\n * \u003c/pre\u003e\n *\n * \u003cp\u003eRecipient Element (REList) Data Structure:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * Value     Size     Description\n * -----     ----     -----------\n * RESize    2 bytes  Size of REHData + REKData\n * REHData   HSize    Hash of recipients public key\n * REKData   (var)    Simple key blob\n *\n *\n * RESize -  This defines the size of an individual REList\n *           element.  This value is the combined size of the\n *           REHData field + REKData field.  REHData is defined by\n *           HSize.  REKData is variable and can be calculated\n *           for each REList element using RESize and HSize.\n *\n * REHData - Hashed public key for this recipient.\n *\n * REKData - Simple Key Blob.  The format of this data structure\n *           is identical to that defined in the Microsoft\n *           CryptoAPI and generated using the CryptExportKey()\n *           function.  The version of the Simple Key Blob\n *           supported at this time is 0x02 as defined by\n *           Microsoft.\n *\n *           For more details see https://msdn.microsoft.com/en-us/library/aa920051.aspx\n * \u003c/pre\u003e\n *\n * \u003cp\u003e\u003cb\u003eFlags\u003c/b\u003e - Processing flags needed for decryption\u003c/p\u003e\n *\n * \u003cul\u003e\n * \u003cli\u003e0x0001 - Password is required to decrypt\u003c/li\u003e\n * \u003cli\u003e0x0002 - Certificates only\u003c/li\u003e\n * \u003cli\u003e0x0003 - Password or certificate required to decrypt\u003c/li\u003e\n * \u003cli\u003e0x0007 - reserved for future use\n * \u003cli\u003e0x000F - reserved for future use\n * \u003cli\u003e0x0100 - indicates non-OAEP key wrapping was used. If this field is set\n * the version needed to extract must be at least 61. This means OAEP key\n * wrapping is not used when generating a Master Session Key using ErdData.\n * \u003cli\u003e0x4000 - ErdData must be decrypted using 3DES-168, otherwise use the same\n * algorithm used for encrypting the file contents.\n * \u003cli\u003e0x8000 - reserved for future use.\n * \u003c/ul\u003e\n *\n * \u003cp\u003e\u003cb\u003eSee the section describing the Strong Encryption Specification for\n * details. Refer to the section in this document entitled\n * \"Incorporating PKWARE Proprietary Technology into Your Product\" for more\n * information.\u003c/b\u003e\u003c/p\u003e\n *\n * @NotThreadSafe\n * @since 1.11\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.X0017_StrongEncryptionHeader()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 36)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "format"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": " TODO written but not read"
    },
    {
      "type": "field",
      "varNames": [
        "algId"
      ],
      "begin_line": 252,
      "end_line": 252,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bitlen"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": " TODO written but not read"
    },
    {
      "type": "field",
      "varNames": [
        "flags"
      ],
      "begin_line": 254,
      "end_line": 254,
      "comment": " TODO written but not read"
    },
    {
      "type": "field",
      "varNames": [
        "rcount"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashAlg"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hashSize"
      ],
      "begin_line": 257,
      "end_line": 257,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ivData"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": " encryption data"
    },
    {
      "type": "field",
      "varNames": [
        "erdData"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "recipientKeyHash"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": " encryption key"
    },
    {
      "type": "field",
      "varNames": [
        "keyBlob"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "vData"
      ],
      "begin_line": 268,
      "end_line": 268,
      "comment": " password verification data"
    },
    {
      "type": "field",
      "varNames": [
        "vCRC32"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.getRecordCount()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Get record count.\n     * @return the record count\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.getHashAlgorithm()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Get hash algorithm.\n     * @return the hash algorithm\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.getEncryptionAlgorithm()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "\n     * Get encryption algorithm.\n     * @return the encryption algorithm\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.parseCentralDirectoryFormat(byte[], int, int)",
      "begin_line": 302,
      "end_line": 319,
      "comment": "\n     * Parse central directory format.\n     *\n     * @param data the buffer to read data from\n     * @param offset offset into buffer to read data\n     * @param length the length of data\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 54)",
        "(line 304,col 9)-(line 304,col 97)",
        "(line 305,col 9)-(line 305,col 58)",
        "(line 306,col 9)-(line 306,col 57)",
        "(line 307,col 9)-(line 307,col 57)",
        "(line 309,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.parseFileFormat(byte[], int, int)",
      "begin_line": 330,
      "end_line": 369,
      "comment": "\n     * Parse file header format.\n     *\n     * \u003cp\u003e(Password only?)\u003c/p\u003e\n     *\n     * @param data the buffer to read data from\n     * @param offset offset into buffer to read data\n     * @param length the length of data\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 59)",
        "(line 332,col 9)-(line 332,col 39)",
        "(line 333,col 9)-(line 333,col 67)",
        "(line 335,col 9)-(line 335,col 67)",
        "(line 336,col 9)-(line 336,col 106)",
        "(line 337,col 9)-(line 337,col 68)",
        "(line 338,col 9)-(line 338,col 67)",
        "(line 340,col 9)-(line 340,col 74)",
        "(line 341,col 9)-(line 341,col 41)",
        "(line 342,col 9)-(line 342,col 79)",
        "(line 344,col 9)-(line 344,col 77)",
        "(line 345,col 9)-(line 345,col 48)",
        "(line 346,col 9)-(line 366,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 371,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 59)",
        "(line 374,col 9)-(line 374,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 377,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 66)",
        "(line 380,col 9)-(line 380,col 58)"
      ]
    }
  ]
}