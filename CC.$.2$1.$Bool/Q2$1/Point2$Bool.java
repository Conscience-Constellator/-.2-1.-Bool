package CC.$.Q2$1;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;

import java.util.Collection;
import java.util.Iterator;

import static CC.COd.Neds_Ovrid.*;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt;

public interface Point2$Bool<Qq$q_Typ,qQ$q_Typ>
{
	/*
	Clas_Rap Class=Init_StRt(Point2$Bool.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	boolean Point2$Bool(
		Qq$q_Typ A,
		qQ$q_Typ B);
		default <
			A extends Qq$q_Typ,
			B extends qQ$q_Typ>boolean Or(
				Iterable<A> List,
				B Sook)
		{
			for(A Item:List)
			{
				if(Point2$Bool(Item,Sook))
				{return true;}
			}
			return false;
		}
		default <
			A extends Qq$q_Typ,
			B extends qQ$q_Typ>boolean Or(
				A[] List,
				B Sook)
		{
			for(A Item:List)
			{
				if(Point2$Bool(Item,Sook))
				{return true;}
			}
			return false;
		}
			default <
				A extends Qq$q_Typ,
				B extends qQ$q_Typ>boolean Or_Al(
					Iterable<A> List,
					Iterable<B> Sook)
			{
				for(B Item:Sook)
				{
					if(Or(List,Item))
					{return true;}
				}
				return false;
			}
			default <
				A extends Qq$q_Typ,
				B extends qQ$q_Typ>boolean Or_Al(
					A[] List,
				B[] Sook)
			{
				for(B Item:Sook)
				{
					if(Or(List,Item))
					{return true;}
				}
				return false;
			}
			default <
				A extends Qq$q_Typ,
				B extends qQ$q_Typ>boolean Or_Al(
					Iterable<A> List,
					B[] Sook)
			{
				for(B Item:Sook)
				{
					if(Or(List,Item))
					{return true;}
				}
				return false;
			}
			default <
				A extends Qq$q_Typ,
				B extends qQ$q_Typ>boolean Or_Al(
					A[] List,
					Iterable<B> Sook)
			{
				for(B Item:Sook)
				{
					if(Or(List,Item))
					{return true;}
				}
				return false;
			}
			default <Item>boolean Or_SAm(
				Iterable<Item> List,
				Item Sook)
			{return ((Point2$Bool<Item,Item>)this).Or(List,Sook);}
			default <Item>boolean Or_SAm(
				Item[] List,
				Item Sook)
			{return ((Point2$Bool<Item,Item>)this).Or(List,Sook);}
		default boolean Al(
			Iterable<Qq$q_Typ> List,
			qQ$q_Typ Sook)
		{
			for(Qq$q_Typ Item:List)
			{
				if(!Point2$Bool(Item,Sook))
				{return false;}
			}
			return true;
		}
		default boolean Al(
			Qq$q_Typ[] List,
			qQ$q_Typ Sook)
		{
			for(Qq$q_Typ Item:List)
			{
				if(!Point2$Bool(Item,Sook))
				{return false;}
			}
			return true;
		}
			default <Item>boolean Al_SAm(
				Iterable<Item> List,
				Item Sook)
			{return ((Point2$Bool<Item,Item>)this).Al(List,Sook);}
			default <Item>boolean Al_SAm(
				Item[] List,
				Item Sook)
			{return ((Point2$Bool<Item,Item>)this).Al(List,Sook);}
		default boolean Xr(
			Iterable<Qq$q_Typ> List,
			Qq$q_Typ Sook,int Num)
		{
			int IndX=0,Count=0;
			Iterator<Qq$q_Typ> Itr=List.iterator();
			for(;Count<Num&&Itr.hasNext()
				;Count+=1)
			{
				if(Point2$Bool(Itr.next(),(qQ$q_Typ)Sook))
				{return false;}
			}
			for(;Itr.hasNext();IndX+=1)
			{}
			return true;
		}
		default <Item>boolean Ad_AbsNt(
			Collection<Item> List,
			Item Item)
		{
			if(!Or_SAm(List,Item))
			{
				List.add(Item);
				return true;
			}
			return false;
		}
		default <
			A extends Qq$q_Typ,
			B extends qQ$q_Typ>int Sek(
			A[] List,
			B Sek)
		{
			int IndX=0;
			for(A Item:List)
			{
				if(Point2$Bool(Item,Sek))
				{return IndX;}
				IndX+=1;
			}
			return -1;
		}
		default <
			A extends Qq$q_Typ,
			B extends qQ$q_Typ>int Sek(
				Iterable<A> List,
				B Sook)
		{
			int IndX=0;
			for(A Item:List)
			{
				if(Point2$Bool(Item,Sook))
				{return IndX;}
				IndX+=1;
			}
			return -1;
		}
		default <
			A extends Qq$q_Typ,
			B extends qQ$q_Typ>int Sek_Rev(
				A[] List,
				B Sek)
		{
			for(int IndX=List.length-1;
				IndX>=0;
				IndX-=1)
			{
				if(Point2$Bool(List[IndX],Sek))
				{return IndX;}
			}
			return -1;
		}
//		default <
//			A extends Qq$q_Typ,
//			B extends qQ$q_Typ>int Sek_Rev(
//				Iterable<Qq$q_Typ> List,
//				Class<Qq$q_Typ> Clas,B Sek)
//		{return Sek_Rev(To_Ara(List,Clas),Sek);}
			default <Item>void Ad_AbsNt_Ara(
				Collection<Item> To,
				Item... From)
			{
				for(Item Item:From)
				{Ad_AbsNt(To,Item);}
			}
//				default <Item extends Typ>void Ad_Absnt(Collection<Item> To,Item... From){Ad_Absnt_Ara(To,(Array)From);}
			default <Item>void Ad_AbsNt_Itr(
				Collection<Item> To,
				Iterable<Item> From)
			{
				for(Item Item:From)
				{Ad_AbsNt(To,Item);}
			}
		default <Item>void Uniq_List(
			Collection<Item> To,
			Item... From)
		{Ad_AbsNt_Ara(To,From);}
//			default <Item>Item[] Uniq_List_Ara(
//				Collection<Item> To,
//				Item... From)
//			{
//				Uniq_List(To,From);
//
//				return Ara_Util.To_Ara(To);
//			}
		default <Item>void Uniq_List(
			Collection<Item> To,
			Iterable<Item> From)
		{Ad_AbsNt_Itr(To,From);}
			default <Item>void Uniq_List(
				Collection<Item> To,
				Iterable<Item>... From_List)
			{
				for(Iterable<Item> From:From_List)
				{Uniq_List(To,From);}
			}
			default <Item>void Uniq_List(
				Collection<Item> To,
				Item[]... From_List)
			{
				for(Item[] From:From_List)
				{Uniq_List(To,From);}
			}
		default int Uniq_Num(
			Collection<Qq$q_Typ> To,
			Iterable<Qq$q_Typ> From)
		{
			Uniq_List(To,From);

			return To.size();
		}
		default int Uniq_Num(
			Collection<Qq$q_Typ> To,
			Qq$q_Typ... From)
		{
			Uniq_List(To,From);

			return To.size();
		}
			default int Uniq_Num_V(
				Collection<Qq$q_Typ> To,
				Iterable<Qq$q_Typ>... From_List)
			{
				Uniq_List(To,From_List);

				return To.size();
			}
			default int Uniq_Num_V(
				Collection<Qq$q_Typ> To,
				Qq$q_Typ[]... From_List)
			{
				Uniq_List(To,From_List);

				return To.size();
			}

	default Qq$q_Typ[] P(Qq$q_Typ[] From,Qq$q_Typ Mach)
	{
		for(Qq$q_Typ Item:From)
		{}
		;

		return null;
	}
}