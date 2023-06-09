PGDMP     .                    {         
   capstonedb    15.3    15.3 \    o           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            p           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            q           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            r           1262    16398 
   capstonedb    DATABASE     ~   CREATE DATABASE capstonedb WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Russian_Russia.1251';
    DROP DATABASE capstonedb;
                postgres    false            �            1259    16421    authusergroup    TABLE     �   CREATE TABLE public.authusergroup (
    id integer NOT NULL,
    customerscredentialsid integer,
    authgroup character varying(20) NOT NULL
);
 !   DROP TABLE public.authusergroup;
       public         heap    postgres    false            �            1259    16420    authusergroup_id_seq    SEQUENCE     �   CREATE SEQUENCE public.authusergroup_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.authusergroup_id_seq;
       public          postgres    false    219            s           0    0    authusergroup_id_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.authusergroup_id_seq OWNED BY public.authusergroup.id;
          public          postgres    false    218            �            1259    16400 	   customers    TABLE     -  CREATE TABLE public.customers (
    id integer NOT NULL,
    name character varying(50) NOT NULL,
    surname character varying(50) NOT NULL,
    mobile character varying(20) NOT NULL,
    dob date NOT NULL,
    email character varying(50) NOT NULL,
    homeaddress character varying(200) NOT NULL
);
    DROP TABLE public.customers;
       public         heap    postgres    false            �            1259    16399    customers_id_seq    SEQUENCE     �   CREATE SEQUENCE public.customers_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.customers_id_seq;
       public          postgres    false    215            t           0    0    customers_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.customers_id_seq OWNED BY public.customers.id;
          public          postgres    false    214            �            1259    16407    customerscredentials    TABLE     �   CREATE TABLE public.customerscredentials (
    id integer NOT NULL,
    customerid integer NOT NULL,
    username character varying(20) NOT NULL,
    password character varying(100) NOT NULL
);
 (   DROP TABLE public.customerscredentials;
       public         heap    postgres    false            �            1259    16406    customerscredentials_id_seq    SEQUENCE     �   CREATE SEQUENCE public.customerscredentials_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 2   DROP SEQUENCE public.customerscredentials_id_seq;
       public          postgres    false    217            u           0    0    customerscredentials_id_seq    SEQUENCE OWNED BY     [   ALTER SEQUENCE public.customerscredentials_id_seq OWNED BY public.customerscredentials.id;
          public          postgres    false    216            �            1259    16465    dishes    TABLE     P   CREATE TABLE public.dishes (
    id integer NOT NULL,
    foodtypeid integer
);
    DROP TABLE public.dishes;
       public         heap    postgres    false            �            1259    16464    dishes_id_seq    SEQUENCE     �   CREATE SEQUENCE public.dishes_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.dishes_id_seq;
       public          postgres    false    227            v           0    0    dishes_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.dishes_id_seq OWNED BY public.dishes.id;
          public          postgres    false    226            �            1259    16447 	   foodtypes    TABLE     �   CREATE TABLE public.foodtypes (
    id integer NOT NULL,
    name character varying(50) NOT NULL,
    price numeric NOT NULL,
    description character varying(200) NOT NULL,
    image bytea
);
    DROP TABLE public.foodtypes;
       public         heap    postgres    false            �            1259    16446    foodtypes_id_seq    SEQUENCE     �   CREATE SEQUENCE public.foodtypes_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.foodtypes_id_seq;
       public          postgres    false    223            w           0    0    foodtypes_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.foodtypes_id_seq OWNED BY public.foodtypes.id;
          public          postgres    false    222            �            1259    16492 	   ordercart    TABLE     ;   CREATE TABLE public.ordercart (
    id integer NOT NULL
);
    DROP TABLE public.ordercart;
       public         heap    postgres    false            �            1259    16498    ordercart_dishes    TABLE     h   CREATE TABLE public.ordercart_dishes (
    ordercartid integer NOT NULL,
    dishid integer NOT NULL
);
 $   DROP TABLE public.ordercart_dishes;
       public         heap    postgres    false            �            1259    16491    ordercart_id_seq    SEQUENCE     �   CREATE SEQUENCE public.ordercart_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.ordercart_id_seq;
       public          postgres    false    230            x           0    0    ordercart_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.ordercart_id_seq OWNED BY public.ordercart.id;
          public          postgres    false    229            �            1259    16514    orderdetails    TABLE     ^  CREATE TABLE public.orderdetails (
    id integer NOT NULL,
    orderid integer,
    ordercartid integer,
    deliveryname character varying(50) NOT NULL,
    deliverymobile character varying(50) NOT NULL,
    deliveryaddress character varying(200) NOT NULL,
    specialcomments character varying(200) NOT NULL,
    deliveryprice numeric NOT NULL
);
     DROP TABLE public.orderdetails;
       public         heap    postgres    false            �            1259    16513    orderdetails_id_seq    SEQUENCE     �   CREATE SEQUENCE public.orderdetails_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 *   DROP SEQUENCE public.orderdetails_id_seq;
       public          postgres    false    233            y           0    0    orderdetails_id_seq    SEQUENCE OWNED BY     K   ALTER SEQUENCE public.orderdetails_id_seq OWNED BY public.orderdetails.id;
          public          postgres    false    232            �            1259    16433    orders    TABLE     �   CREATE TABLE public.orders (
    id integer NOT NULL,
    customerid integer,
    sum numeric NOT NULL,
    date date NOT NULL
);
    DROP TABLE public.orders;
       public         heap    postgres    false            �            1259    16432    orders_id_seq    SEQUENCE     �   CREATE SEQUENCE public.orders_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.orders_id_seq;
       public          postgres    false    221            z           0    0    orders_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.orders_id_seq OWNED BY public.orders.id;
          public          postgres    false    220            �            1259    16533    payments    TABLE     �   CREATE TABLE public.payments (
    id integer NOT NULL,
    orderid integer,
    paymentmethod character varying(20) NOT NULL
);
    DROP TABLE public.payments;
       public         heap    postgres    false            �            1259    16532    payments_id_seq    SEQUENCE     �   CREATE SEQUENCE public.payments_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.payments_id_seq;
       public          postgres    false    235            {           0    0    payments_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.payments_id_seq OWNED BY public.payments.id;
          public          postgres    false    234            �            1259    16456    toppings    TABLE        CREATE TABLE public.toppings (
    id integer NOT NULL,
    name character varying(50) NOT NULL,
    price numeric NOT NULL
);
    DROP TABLE public.toppings;
       public         heap    postgres    false            �            1259    16476    toppings_dishes    TABLE     e   CREATE TABLE public.toppings_dishes (
    toppingid integer NOT NULL,
    dishid integer NOT NULL
);
 #   DROP TABLE public.toppings_dishes;
       public         heap    postgres    false            �            1259    16455    toppings_id_seq    SEQUENCE     �   CREATE SEQUENCE public.toppings_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.toppings_id_seq;
       public          postgres    false    225            |           0    0    toppings_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.toppings_id_seq OWNED BY public.toppings.id;
          public          postgres    false    224            �           2604    16424    authusergroup id    DEFAULT     t   ALTER TABLE ONLY public.authusergroup ALTER COLUMN id SET DEFAULT nextval('public.authusergroup_id_seq'::regclass);
 ?   ALTER TABLE public.authusergroup ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    218    219    219            �           2604    16403    customers id    DEFAULT     l   ALTER TABLE ONLY public.customers ALTER COLUMN id SET DEFAULT nextval('public.customers_id_seq'::regclass);
 ;   ALTER TABLE public.customers ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    215    214    215            �           2604    16410    customerscredentials id    DEFAULT     �   ALTER TABLE ONLY public.customerscredentials ALTER COLUMN id SET DEFAULT nextval('public.customerscredentials_id_seq'::regclass);
 F   ALTER TABLE public.customerscredentials ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    217    216    217            �           2604    16468 	   dishes id    DEFAULT     f   ALTER TABLE ONLY public.dishes ALTER COLUMN id SET DEFAULT nextval('public.dishes_id_seq'::regclass);
 8   ALTER TABLE public.dishes ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    226    227    227            �           2604    16450    foodtypes id    DEFAULT     l   ALTER TABLE ONLY public.foodtypes ALTER COLUMN id SET DEFAULT nextval('public.foodtypes_id_seq'::regclass);
 ;   ALTER TABLE public.foodtypes ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    222    223    223            �           2604    16495    ordercart id    DEFAULT     l   ALTER TABLE ONLY public.ordercart ALTER COLUMN id SET DEFAULT nextval('public.ordercart_id_seq'::regclass);
 ;   ALTER TABLE public.ordercart ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    230    229    230            �           2604    16517    orderdetails id    DEFAULT     r   ALTER TABLE ONLY public.orderdetails ALTER COLUMN id SET DEFAULT nextval('public.orderdetails_id_seq'::regclass);
 >   ALTER TABLE public.orderdetails ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    233    232    233            �           2604    16436 	   orders id    DEFAULT     f   ALTER TABLE ONLY public.orders ALTER COLUMN id SET DEFAULT nextval('public.orders_id_seq'::regclass);
 8   ALTER TABLE public.orders ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    221    220    221            �           2604    16536    payments id    DEFAULT     j   ALTER TABLE ONLY public.payments ALTER COLUMN id SET DEFAULT nextval('public.payments_id_seq'::regclass);
 :   ALTER TABLE public.payments ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    234    235    235            �           2604    16459    toppings id    DEFAULT     j   ALTER TABLE ONLY public.toppings ALTER COLUMN id SET DEFAULT nextval('public.toppings_id_seq'::regclass);
 :   ALTER TABLE public.toppings ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    224    225    225            \          0    16421    authusergroup 
   TABLE DATA           N   COPY public.authusergroup (id, customerscredentialsid, authgroup) FROM stdin;
    public          postgres    false    219   ^j       X          0    16400 	   customers 
   TABLE DATA           W   COPY public.customers (id, name, surname, mobile, dob, email, homeaddress) FROM stdin;
    public          postgres    false    215   �j       Z          0    16407    customerscredentials 
   TABLE DATA           R   COPY public.customerscredentials (id, customerid, username, password) FROM stdin;
    public          postgres    false    217   �j       d          0    16465    dishes 
   TABLE DATA           0   COPY public.dishes (id, foodtypeid) FROM stdin;
    public          postgres    false    227   Yk       `          0    16447 	   foodtypes 
   TABLE DATA           H   COPY public.foodtypes (id, name, price, description, image) FROM stdin;
    public          postgres    false    223   vk       g          0    16492 	   ordercart 
   TABLE DATA           '   COPY public.ordercart (id) FROM stdin;
    public          postgres    false    230   0m       h          0    16498    ordercart_dishes 
   TABLE DATA           ?   COPY public.ordercart_dishes (ordercartid, dishid) FROM stdin;
    public          postgres    false    231   Mm       j          0    16514    orderdetails 
   TABLE DATA           �   COPY public.orderdetails (id, orderid, ordercartid, deliveryname, deliverymobile, deliveryaddress, specialcomments, deliveryprice) FROM stdin;
    public          postgres    false    233   jm       ^          0    16433    orders 
   TABLE DATA           ;   COPY public.orders (id, customerid, sum, date) FROM stdin;
    public          postgres    false    221   �m       l          0    16533    payments 
   TABLE DATA           >   COPY public.payments (id, orderid, paymentmethod) FROM stdin;
    public          postgres    false    235   �m       b          0    16456    toppings 
   TABLE DATA           3   COPY public.toppings (id, name, price) FROM stdin;
    public          postgres    false    225   �m       e          0    16476    toppings_dishes 
   TABLE DATA           <   COPY public.toppings_dishes (toppingid, dishid) FROM stdin;
    public          postgres    false    228   1n       }           0    0    authusergroup_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.authusergroup_id_seq', 4, true);
          public          postgres    false    218            ~           0    0    customers_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.customers_id_seq', 5, true);
          public          postgres    false    214                       0    0    customerscredentials_id_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.customerscredentials_id_seq', 7, true);
          public          postgres    false    216            �           0    0    dishes_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.dishes_id_seq', 1, false);
          public          postgres    false    226            �           0    0    foodtypes_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.foodtypes_id_seq', 21, true);
          public          postgres    false    222            �           0    0    ordercart_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.ordercart_id_seq', 1, false);
          public          postgres    false    229            �           0    0    orderdetails_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.orderdetails_id_seq', 1, false);
          public          postgres    false    232            �           0    0    orders_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.orders_id_seq', 1, false);
          public          postgres    false    220            �           0    0    payments_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.payments_id_seq', 1, false);
          public          postgres    false    234            �           0    0    toppings_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.toppings_id_seq', 16, true);
          public          postgres    false    224            �           2606    16426     authusergroup authusergroup_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.authusergroup
    ADD CONSTRAINT authusergroup_pkey PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.authusergroup DROP CONSTRAINT authusergroup_pkey;
       public            postgres    false    219            �           2606    16405    customers customers_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.customers
    ADD CONSTRAINT customers_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.customers DROP CONSTRAINT customers_pkey;
       public            postgres    false    215            �           2606    16412 .   customerscredentials customerscredentials_pkey 
   CONSTRAINT     l   ALTER TABLE ONLY public.customerscredentials
    ADD CONSTRAINT customerscredentials_pkey PRIMARY KEY (id);
 X   ALTER TABLE ONLY public.customerscredentials DROP CONSTRAINT customerscredentials_pkey;
       public            postgres    false    217            �           2606    16414 6   customerscredentials customerscredentials_username_key 
   CONSTRAINT     u   ALTER TABLE ONLY public.customerscredentials
    ADD CONSTRAINT customerscredentials_username_key UNIQUE (username);
 `   ALTER TABLE ONLY public.customerscredentials DROP CONSTRAINT customerscredentials_username_key;
       public            postgres    false    217            �           2606    16470    dishes dishes_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.dishes
    ADD CONSTRAINT dishes_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.dishes DROP CONSTRAINT dishes_pkey;
       public            postgres    false    227            �           2606    16454    foodtypes foodtypes_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.foodtypes
    ADD CONSTRAINT foodtypes_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.foodtypes DROP CONSTRAINT foodtypes_pkey;
       public            postgres    false    223            �           2606    16502 $   ordercart_dishes ordercart_dishes_pk 
   CONSTRAINT     s   ALTER TABLE ONLY public.ordercart_dishes
    ADD CONSTRAINT ordercart_dishes_pk PRIMARY KEY (ordercartid, dishid);
 N   ALTER TABLE ONLY public.ordercart_dishes DROP CONSTRAINT ordercart_dishes_pk;
       public            postgres    false    231    231            �           2606    16497    ordercart ordercart_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.ordercart
    ADD CONSTRAINT ordercart_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.ordercart DROP CONSTRAINT ordercart_pkey;
       public            postgres    false    230            �           2606    16521    orderdetails orderdetails_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.orderdetails
    ADD CONSTRAINT orderdetails_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.orderdetails DROP CONSTRAINT orderdetails_pkey;
       public            postgres    false    233            �           2606    16440    orders orders_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.orders DROP CONSTRAINT orders_pkey;
       public            postgres    false    221            �           2606    16538    payments payments_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.payments
    ADD CONSTRAINT payments_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.payments DROP CONSTRAINT payments_pkey;
       public            postgres    false    235            �           2606    16480 "   toppings_dishes toppings_dishes_pk 
   CONSTRAINT     o   ALTER TABLE ONLY public.toppings_dishes
    ADD CONSTRAINT toppings_dishes_pk PRIMARY KEY (dishid, toppingid);
 L   ALTER TABLE ONLY public.toppings_dishes DROP CONSTRAINT toppings_dishes_pk;
       public            postgres    false    228    228            �           2606    16463    toppings toppings_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.toppings
    ADD CONSTRAINT toppings_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.toppings DROP CONSTRAINT toppings_pkey;
       public            postgres    false    225            �           2606    16427 7   authusergroup authusergroup_customerscredentialsid_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.authusergroup
    ADD CONSTRAINT authusergroup_customerscredentialsid_fkey FOREIGN KEY (customerscredentialsid) REFERENCES public.customerscredentials(id);
 a   ALTER TABLE ONLY public.authusergroup DROP CONSTRAINT authusergroup_customerscredentialsid_fkey;
       public          postgres    false    219    217    3239            �           2606    16415 9   customerscredentials customerscredentials_customerid_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.customerscredentials
    ADD CONSTRAINT customerscredentials_customerid_fkey FOREIGN KEY (customerid) REFERENCES public.customers(id);
 c   ALTER TABLE ONLY public.customerscredentials DROP CONSTRAINT customerscredentials_customerid_fkey;
       public          postgres    false    3237    217    215            �           2606    16471    dishes dishes_foodtypeid_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.dishes
    ADD CONSTRAINT dishes_foodtypeid_fkey FOREIGN KEY (foodtypeid) REFERENCES public.foodtypes(id);
 G   ALTER TABLE ONLY public.dishes DROP CONSTRAINT dishes_foodtypeid_fkey;
       public          postgres    false    3247    227    223            �           2606    16508 -   ordercart_dishes ordercart_dishes_dishid_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.ordercart_dishes
    ADD CONSTRAINT ordercart_dishes_dishid_fkey FOREIGN KEY (dishid) REFERENCES public.dishes(id);
 W   ALTER TABLE ONLY public.ordercart_dishes DROP CONSTRAINT ordercart_dishes_dishid_fkey;
       public          postgres    false    227    3251    231            �           2606    16503 2   ordercart_dishes ordercart_dishes_ordercartid_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.ordercart_dishes
    ADD CONSTRAINT ordercart_dishes_ordercartid_fkey FOREIGN KEY (ordercartid) REFERENCES public.ordercart(id);
 \   ALTER TABLE ONLY public.ordercart_dishes DROP CONSTRAINT ordercart_dishes_ordercartid_fkey;
       public          postgres    false    3255    231    230            �           2606    16527 *   orderdetails orderdetails_ordercartid_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.orderdetails
    ADD CONSTRAINT orderdetails_ordercartid_fkey FOREIGN KEY (ordercartid) REFERENCES public.ordercart(id);
 T   ALTER TABLE ONLY public.orderdetails DROP CONSTRAINT orderdetails_ordercartid_fkey;
       public          postgres    false    3255    230    233            �           2606    16522 &   orderdetails orderdetails_orderid_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.orderdetails
    ADD CONSTRAINT orderdetails_orderid_fkey FOREIGN KEY (orderid) REFERENCES public.orders(id);
 P   ALTER TABLE ONLY public.orderdetails DROP CONSTRAINT orderdetails_orderid_fkey;
       public          postgres    false    233    221    3245            �           2606    16441    orders orders_customerid_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.orders
    ADD CONSTRAINT orders_customerid_fkey FOREIGN KEY (customerid) REFERENCES public.customers(id);
 G   ALTER TABLE ONLY public.orders DROP CONSTRAINT orders_customerid_fkey;
       public          postgres    false    221    3237    215            �           2606    16539    payments payments_orderid_fkey    FK CONSTRAINT     ~   ALTER TABLE ONLY public.payments
    ADD CONSTRAINT payments_orderid_fkey FOREIGN KEY (orderid) REFERENCES public.orders(id);
 H   ALTER TABLE ONLY public.payments DROP CONSTRAINT payments_orderid_fkey;
       public          postgres    false    221    235    3245            �           2606    16486 +   toppings_dishes toppings_dishes_dishid_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.toppings_dishes
    ADD CONSTRAINT toppings_dishes_dishid_fkey FOREIGN KEY (dishid) REFERENCES public.dishes(id);
 U   ALTER TABLE ONLY public.toppings_dishes DROP CONSTRAINT toppings_dishes_dishid_fkey;
       public          postgres    false    3251    228    227            �           2606    16481 .   toppings_dishes toppings_dishes_toppingid_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.toppings_dishes
    ADD CONSTRAINT toppings_dishes_toppingid_fkey FOREIGN KEY (toppingid) REFERENCES public.toppings(id);
 X   ALTER TABLE ONLY public.toppings_dishes DROP CONSTRAINT toppings_dishes_toppingid_fkey;
       public          postgres    false    228    225    3249            \   (   x�3�4�tt����2��C�C�}]�����&��1z\\\ �
]      X   L   x�3�t�w�t��q��4770##ccN###]3]C������������/\(X����U�����58�+F��� �9z      Z   W   x�3�4�t�wr��q��T1JT14P)3*,q���-)�461�ˌt+5Գ4	���6�1��r��,6q�r�����06HO����� LE      d      x������ � �      `   �  x�Œ�N�@Eם��h"��@���,@ $Vl*N��~�32_O��(�Y��ac��{떏`O��ቜ#o�dbSU����{p�2��j
�WSC��Z�������t=h�=)���qQO�t<���t��M����b��3܍�����}�C�ۉ�:�%�`���P,V��a���'M�.9�� �s��b�Oz�r��
u.'�~FT2�f��m�|�rڤ�'�Wj)��Lԫ�=���!��l��	����:��[���Ok��y������t3��H�:W^X�.+�����|� ���K�V8z
]9�T�O;gt�'�{������Q#NB�7��#:��x�_)D8����º�ng��v~�Dui����D=bb�e�����씉�`vsq̶߂��L��՗1���1{[.�m�o�      g      x������ � �      h      x������ � �      j      x������ � �      ^      x������ � �      l      x������ � �      b   `   x�]�K
�0 �uri�S��H@��`���e�r�~0wr=����J-�w�0^�Vϗ;�I���lբժ9͈�#�!#���'��ۄ�$n;�      e      x������ � �     