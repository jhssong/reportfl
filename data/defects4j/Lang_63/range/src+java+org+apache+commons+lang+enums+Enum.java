{
  "filepath": "/tmp/Lang-63b/src/java/org/apache/commons/lang/enums/Enum.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Enum",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable",
        "java.io.Serializable"
      ],
      "begin_line": 237,
      "end_line": 631,
      "comment": "\n * \u003cp\u003eAbstract superclass for type-safe enums.\u003c/p\u003e\n *\n * \u003cp\u003eOne feature of the C programming language lacking in Java is enumerations. The\n * C implementation based on ints was poor and open to abuse. The original Java\n * recommendation and most of the JDK also uses int constants. It has been recognised\n * however that a more robust type-safe class-based solution can be designed. This\n * class follows the basic Java type-safe enumeration pattern.\u003c/p\u003e\n *\n * \u003cp\u003e\u003cem\u003eNOTE:\u003c/em\u003e Due to the way in which Java ClassLoaders work, comparing\n * Enum objects should always be done using \u003ccode\u003eequals()\u003c/code\u003e, not \u003ccode\u003e\u003d\u003d\u003c/code\u003e.\n * The equals() method will try \u003d\u003d first so in most cases the effect is the same.\u003c/p\u003e\n * \n * \u003cp\u003eOf course, if you actually want (or don\u0027t mind) Enums in different class\n * loaders being non-equal, then you can use \u003ccode\u003e\u003d\u003d\u003c/code\u003e.\u003c/p\u003e\n * \n * \u003ch4\u003eSimple Enums\u003c/h4\u003e\n *\n * \u003cp\u003eTo use this class, it must be subclassed. For example:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public final class ColorEnum extends Enum {\n *   public static final ColorEnum RED \u003d new ColorEnum(\"Red\");\n *   public static final ColorEnum GREEN \u003d new ColorEnum(\"Green\");\n *   public static final ColorEnum BLUE \u003d new ColorEnum(\"Blue\");\n *\n *   private ColorEnum(String color) {\n *     super(color);\n *   }\n * \n *   public static ColorEnum getEnum(String color) {\n *     return (ColorEnum) getEnum(ColorEnum.class, color);\n *   }\n * \n *   public static Map getEnumMap() {\n *     return getEnumMap(ColorEnum.class);\n *   }\n * \n *   public static List getEnumList() {\n *     return getEnumList(ColorEnum.class);\n *   }\n * \n *   public static Iterator iterator() {\n *     return iterator(ColorEnum.class);\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eAs shown, each enum has a name. This can be accessed using \u003ccode\u003egetName\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eThe \u003ccode\u003egetEnum\u003c/code\u003e and \u003ccode\u003eiterator\u003c/code\u003e methods are recommended.\n * Unfortunately, Java restrictions require these to be coded as shown in each subclass.\n * An alternative choice is to use the {@link EnumUtils} class.\u003c/p\u003e\n * \n * \u003ch4\u003eSubclassed Enums\u003c/h4\u003e\n * \u003cp\u003eA hierarchy of Enum classes can be built. In this case, the superclass is\n * unaffected by the addition of subclasses (as per normal Java). The subclasses\n * may add additional Enum constants \u003cem\u003eof the type of the superclass\u003c/em\u003e. The\n * query methods on the subclass will return all of the Enum constants from the\n * superclass and subclass.\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public final class ExtraColorEnum extends ColorEnum {\n *   // NOTE: Color enum declared above is final, change that to get this\n *   // example to compile.\n *   public static final ColorEnum YELLOW \u003d new ExtraColorEnum(\"Yellow\");\n *\n *   private ExtraColorEnum(String color) {\n *     super(color);\n *   }\n * \n *   public static ColorEnum getEnum(String color) {\n *     return (ColorEnum) getEnum(ExtraColorEnum.class, color);\n *   }\n * \n *   public static Map getEnumMap() {\n *     return getEnumMap(ExtraColorEnum.class);\n *   }\n * \n *   public static List getEnumList() {\n *     return getEnumList(ExtraColorEnum.class);\n *   }\n * \n *   public static Iterator iterator() {\n *     return iterator(ExtraColorEnum.class);\n *   }\n * }\n * \u003c/pre\u003e\n *\n * \u003cp\u003eThis example will return RED, GREEN, BLUE, YELLOW from the List and iterator\n * methods in that order. The RED, GREEN and BLUE instances will be the same (\u003d\u003d) \n * as those from the superclass ColorEnum. Note that YELLOW is declared as a\n * ColorEnum and not an ExtraColorEnum.\u003c/p\u003e\n * \n * \u003ch4\u003eFunctional Enums\u003c/h4\u003e\n *\n * \u003cp\u003eThe enums can have functionality by defining subclasses and\n * overriding the \u003ccode\u003egetEnumClass()\u003c/code\u003e method:\u003c/p\u003e\n * \n * \u003cpre\u003e\n *   public static final OperationEnum PLUS \u003d new PlusOperation();\n *   private static final class PlusOperation extends OperationEnum {\n *     private PlusOperation() {\n *       super(\"Plus\");\n *     }\n *     public int eval(int a, int b) {\n *       return a + b;\n *     }\n *   }\n *   public static final OperationEnum MINUS \u003d new MinusOperation();\n *   private static final class MinusOperation extends OperationEnum {\n *     private MinusOperation() {\n *       super(\"Minus\");\n *     }\n *     public int eval(int a, int b) {\n *       return a - b;\n *     }\n *   }\n *\n *   private OperationEnum(String color) {\n *     super(color);\n *   }\n * \n *   public final Class getEnumClass() {     // NOTE: new method!\n *     return OperationEnum.class;\n *   }\n *\n *   public abstract double eval(double a, double b);\n * \n *   public static OperationEnum getEnum(String name) {\n *     return (OperationEnum) getEnum(OperationEnum.class, name);\n *   }\n * \n *   public static Map getEnumMap() {\n *     return getEnumMap(OperationEnum.class);\n *   }\n * \n *   public static List getEnumList() {\n *     return getEnumList(OperationEnum.class);\n *   }\n * \n *   public static Iterator iterator() {\n *     return iterator(OperationEnum.class);\n *   }\n * }\n * \u003c/pre\u003e\n * \u003cp\u003eThe code above will work on JDK 1.2. If JDK1.3 and later is used,\n * the subclasses may be defined as anonymous.\u003c/p\u003e\n * \n * \u003ch4\u003eNested class Enums\u003c/h4\u003e\n *\n * \u003cp\u003eCare must be taken with class loading when defining a static nested class\n * for enums. The static nested class can be loaded without the surrounding outer\n * class being loaded. This can result in an empty list/map/iterator being returned.\n * One solution is to define a static block that references the outer class where\n * the constants are defined. For example:\u003c/p\u003e\n *\n * \u003cpre\u003e\n * public final class Outer {\n *   public static final BWEnum BLACK \u003d new BWEnum(\"Black\");\n *   public static final BWEnum WHITE \u003d new BWEnum(\"White\");\n *\n *   // static nested enum class\n *   public static final class BWEnum extends Enum {\n * \n *     static {\n *       // explicitly reference BWEnum class to force constants to load\n *       Object obj \u003d Outer.BLACK;\n *     }\n * \n *     // ... other methods omitted\n *   }\n * }\n * \u003c/pre\u003e\n * \n * \u003cp\u003eAlthough the above solves the problem, it is not recommended. The best solution\n * is to define the constants in the enum class, and hold references in the outer class:\n *\n * \u003cpre\u003e\n * public final class Outer {\n *   public static final BWEnum BLACK \u003d BWEnum.BLACK;\n *   public static final BWEnum WHITE \u003d BWEnum.WHITE;\n *\n *   // static nested enum class\n *   public static final class BWEnum extends Enum {\n *     // only define constants in enum classes - private if desired\n *     private static final BWEnum BLACK \u003d new BWEnum(\"Black\");\n *     private static final BWEnum WHITE \u003d new BWEnum(\"White\");\n * \n *     // ... other methods omitted\n *   }\n * }\n * \u003c/pre\u003e\n * \n * \u003cp\u003eFor more details, see the \u0027Nested\u0027 test cases.\n * \n * @author Apache Avalon project\n * @author Stephen Colebourne\n * @author Chris Webb\n * @author Mike Bowler\n * @author Matthias Eichel\n * @since 2.1 (class existed in enum package from v1.0)\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_MAP"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": "\n     * An empty \u003ccode\u003eMap\u003c/code\u003e, as JDK1.2 didn\u0027t have an empty map.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cEnumClasses"
      ],
      "begin_line": 256,
      "end_line": 256,
      "comment": "\n     * \u003ccode\u003eMap\u003c/code\u003e, key of class name, value of \u003ccode\u003eEntry\u003c/code\u003e.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iName"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": "\n     * The string representation of the Enum.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iHashCode"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": "\n     * The hashcode representation of the Enum.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "iToString"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": "\n     * The toString representation of the Enum.\n     * @since 2.0\n     "
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 277,
      "end_line": 301,
      "comment": "\n     * \u003cp\u003eEnable the iterator to retain the source code order.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "map"
      ],
      "begin_line": 281,
      "end_line": 281,
      "comment": "\n         * Map of Enum name to Enum.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "unmodifiableMap"
      ],
      "begin_line": 285,
      "end_line": 285,
      "comment": "\n         * Map of Enum name to Enum.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "list"
      ],
      "begin_line": 289,
      "end_line": 289,
      "comment": "\n         * List of Enums in source code order.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "unmodifiableList"
      ],
      "begin_line": 293,
      "end_line": 293,
      "comment": "\n         * Map of Enum name to Enum.\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.enums.Enum.Entry.Entry()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n         * \u003cp\u003eRestrictive constructor.\u003c/p\u003e\n         ",
      "child_ranges": [
        "(line 299,col 11)-(line 299,col 18)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.enums.Enum.Enum(java.lang.String)",
      "begin_line": 313,
      "end_line": 319,
      "comment": "\n     * \u003cp\u003eConstructor to add a new named item to the enumeration.\u003c/p\u003e\n     *\n     * @param name  the name of the enum object,\n     *  must not be empty or \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the name is \u003ccode\u003enull\u003c/code\u003e\n     *  or an empty string\n     * @throws IllegalArgumentException if the getEnumClass() method returns\n     *  a null or invalid Class\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 16)",
        "(line 315,col 9)-(line 315,col 19)",
        "(line 316,col 9)-(line 316,col 21)",
        "(line 317,col 9)-(line 317,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.init(java.lang.String)",
      "begin_line": 328,
      "end_line": 361,
      "comment": "\n     * Initializes the enumeration.\n     * \n     * @param name  the enum name\n     * @throws IllegalArgumentException if the name is null or empty or duplicate\n     * @throws IllegalArgumentException if the enumClass is null or invalid\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)",
        "(line 333,col 9)-(line 333,col 41)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 31)",
        "(line 338,col 9)-(line 338,col 27)",
        "(line 339,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 351,col 9)-(line 351,col 58)",
        "(line 352,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 34)",
        "(line 360,col 9)-(line 360,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.readResolve()",
      "begin_line": 369,
      "end_line": 375,
      "comment": "\n     * \u003cp\u003eHandle the deserialization of the class to ensure that multiple\n     * copies are not wastefully created, or illegal enum types created.\u003c/p\u003e\n     *\n     * @return the resolved object\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 63)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.getEnum(java.lang.Class, java.lang.String)",
      "begin_line": 390,
      "end_line": 396,
      "comment": "\n     * \u003cp\u003eGets an \u003ccode\u003eEnum\u003c/code\u003e object by class and name.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the Enum to get, must not\n     *  be \u003ccode\u003enull\u003c/code\u003e\n     * @param name  the name of the \u003ccode\u003eEnum\u003c/code\u003e to get,\n     *  may be \u003ccode\u003enull\u003c/code\u003e\n     * @return the enum object, or \u003ccode\u003enull\u003c/code\u003e if the enum does not exist\n     * @throws IllegalArgumentException if the enum class\n     *  is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 42)",
        "(line 392,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 395,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.getEnumMap(java.lang.Class)",
      "begin_line": 411,
      "end_line": 417,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eMap\u003c/code\u003e of \u003ccode\u003eEnum\u003c/code\u003e objects by\n     * name using the \u003ccode\u003eEnum\u003c/code\u003e class.\u003c/p\u003e\n     *\n     * \u003cp\u003eIf the requested class has no enum objects an empty\n     * \u003ccode\u003eMap\u003c/code\u003e is returned.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get,\n     *  must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return the enum object Map\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the enum class is not a subclass of Enum\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 42)",
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.getEnumList(java.lang.Class)",
      "begin_line": 433,
      "end_line": 439,
      "comment": "\n     * \u003cp\u003eGets the \u003ccode\u003eList\u003c/code\u003e of \u003ccode\u003eEnum\u003c/code\u003e objects using the\n     * \u003ccode\u003eEnum\u003c/code\u003e class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe list is in the order that the objects were created (source code order).\n     * If the requested class has no enum objects an empty \u003ccode\u003eList\u003c/code\u003e is\n     * returned.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get,\n     *  must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return the enum object Map\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the enum class is not a subclass of Enum\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 42)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.iterator(java.lang.Class)",
      "begin_line": 455,
      "end_line": 457,
      "comment": "\n     * \u003cp\u003eGets an \u003ccode\u003eIterator\u003c/code\u003e over the \u003ccode\u003eEnum\u003c/code\u003e objects in\n     * an \u003ccode\u003eEnum\u003c/code\u003e class.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe \u003ccode\u003eIterator\u003c/code\u003e is in the order that the objects were\n     * created (source code order). If the requested class has no enum\n     * objects an empty \u003ccode\u003eIterator\u003c/code\u003e is returned.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get,\n     *  must not be \u003ccode\u003enull\u003c/code\u003e\n     * @return an iterator of the Enum objects\n     * @throws IllegalArgumentException if the enum class is \u003ccode\u003enull\u003c/code\u003e\n     * @throws IllegalArgumentException if the enum class is not a subclass of Enum\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.getEntry(java.lang.Class)",
      "begin_line": 466,
      "end_line": 475,
      "comment": "\n     * \u003cp\u003eGets an \u003ccode\u003eEntry\u003c/code\u003e from the map of Enums.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @return the enum entry\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 58)",
        "(line 474,col 9)-(line 474,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.createEntry(java.lang.Class)",
      "begin_line": 485,
      "end_line": 498,
      "comment": "\n     * \u003cp\u003eCreates an \u003ccode\u003eEntry\u003c/code\u003e for storing the Enums.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis accounts for subclassed Enums.\u003c/p\u003e\n     * \n     * @param enumClass  the class of the \u003ccode\u003eEnum\u003c/code\u003e to get\n     * @return the enum entry\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 34)",
        "(line 487,col 9)-(line 487,col 46)",
        "(line 488,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.getName()",
      "begin_line": 506,
      "end_line": 508,
      "comment": "\n     * \u003cp\u003eRetrieve the name of this Enum item, set in the constructor.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eString\u003c/code\u003e name of this Enum item\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.getEnumClass()",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\n     * \u003cp\u003eRetrieves the Class of this Enum item, set in the constructor.\u003c/p\u003e\n     * \n     * \u003cp\u003eThis is normally the same as \u003ccode\u003egetClass()\u003c/code\u003e, but for\n     * advanced Enums may be different. If overridden, it must return a\n     * constant value.\u003c/p\u003e\n     * \n     * @return the \u003ccode\u003eClass\u003c/code\u003e of the enum\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.equals(java.lang.Object)",
      "begin_line": 537,
      "end_line": 554,
      "comment": "\n     * \u003cp\u003eTests for equality.\u003c/p\u003e\n     *\n     * \u003cp\u003eTwo Enum objects are considered equal\n     * if they have the same class names and the same names.\n     * Identity is tested for first, so this method usually runs fast.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the parameter is in a different class loader than this instance,\n     * reflection is used to compare the names.\u003c/p\u003e\n     *\n     * @param other  the other object to compare for equality\n     * @return \u003ccode\u003etrue\u003c/code\u003e if the Enums are equal\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 553,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.hashCode()",
      "begin_line": 561,
      "end_line": 563,
      "comment": "\n     * \u003cp\u003eReturns a suitable hashCode for the enumeration.\u003c/p\u003e\n     *\n     * @return a hashcode based on the name\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.compareTo(java.lang.Object)",
      "begin_line": 581,
      "end_line": 593,
      "comment": "\n     * \u003cp\u003eTests for order.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe default ordering is alphabetic by name, but this\n     * can be overridden by subclasses.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf the parameter is in a different class loader than this instance,\n     * reflection is used to compare the names.\u003c/p\u003e\n     *\n     * @see java.lang.Comparable#compareTo(Object)\n     * @param other  the other object to compare to\n     * @return -ve if this is less than the other object, +ve if greater\n     *  than, \u003ccode\u003e0\u003c/code\u003e of equal\n     * @throws ClassCastException if other is not an Enum\n     * @throws NullPointerException if other is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 592,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.getNameInOtherClassLoader(java.lang.Object)",
      "begin_line": 601,
      "end_line": 614,
      "comment": "\n     * \u003cp\u003eUse reflection to return an objects class name.\u003c/p\u003e\n     *\n     * @param other The object to determine the class name for\n     * @return The class name\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 613,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.enums.Enum.toString()",
      "begin_line": 623,
      "end_line": 629,
      "comment": "\n     * \u003cp\u003eHuman readable description of this Enum item.\u003c/p\u003e\n     * \n     * @return String in the form \u003ccode\u003etype[name]\u003c/code\u003e, for example:\n     * \u003ccode\u003eColor[Red]\u003c/code\u003e. Note that the package name is stripped from\n     * the type name.\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 628,col 25)"
      ]
    }
  ]
}