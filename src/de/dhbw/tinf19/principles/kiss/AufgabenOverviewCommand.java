package de.dhbw.tinf19.principles.kiss;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public abstract class AufgabenOverviewCommand {
	private enum UnionType {
		Erstellen,
		Bearbeiten,
		Entfernen,
		Details,
		Selected,
		MyCase,
		MyCase2,
		;
	}

	private UnionType unionType;

	public AufgabenOverviewCommand(UnionType unionType) {
		this.unionType = unionType;
	}

	public <TReturn> TReturn match(
			Function<Erstellen, TReturn> erstellen,
			Function<Bearbeiten, TReturn> bearbeiten,
			Function<Entfernen, TReturn> entfernen,
			Function<Details, TReturn> details,
			Function<Selected, TReturn> selected) {
		switch (this.unionType) {
		case Erstellen:
			return erstellen.apply((Erstellen) this);
		case Bearbeiten:
			return bearbeiten.apply((Bearbeiten) this);
		case Entfernen:
			return entfernen.apply((Entfernen) this);
		case Details:
			return details.apply((Details) this);
		case Selected:
			return selected.apply((Selected) this);
		default:
			throw new IllegalStateException("missing handler for union type: 'unionType'.");
		}
	}

	public Void matchVoid(
			Function<Erstellen, Void> erstellen,
			Function<Bearbeiten, Void> bearbeiten,
			Function<Entfernen, Void> entfernen,
			Function<Details, Void> details,
			Function<Selected, Void> selected) {
		switch (this.unionType) {
		case Erstellen:
			return erstellen.apply((Erstellen) this);
		case Bearbeiten:
			return bearbeiten.apply((Bearbeiten) this);
		case Entfernen:
			return entfernen.apply((Entfernen) this);
		case Details:
			return details.apply((Details) this);
		case Selected:
			return selected.apply((Selected) this);
		default:
			throw new IllegalStateException("missing handler for union type: 'unionType'.");
		}
	}

	public void matchVoid(
			Consumer<Erstellen> erstellen,
			Consumer<Bearbeiten> bearbeiten,
			Consumer<Entfernen> entfernen,
			Consumer<Details> details,
			Consumer<Selected> selected) {
		switch (this.unionType) {
		case Erstellen:
			erstellen.accept((Erstellen) this);
			break;
		case Bearbeiten:
			bearbeiten.accept((Bearbeiten) this);
			break;
		case Entfernen:
			entfernen.accept((Entfernen) this);
			break;
		case Details:
			details.accept((Details) this);
			break;
		case Selected:
			selected.accept((Selected) this);
			break;
		default:
			throw new IllegalStateException("missing handler for union type: 'unionType'.");
		}
	}

	public static class Erstellen extends AufgabenOverviewCommand {
		public Erstellen() {
			super(UnionType.Erstellen);
		}
	}

	public static class Bearbeiten extends AufgabenOverviewCommand {
		public Bearbeiten() {
			super(UnionType.Bearbeiten);
		}
	}

	public static class Entfernen extends AufgabenOverviewCommand {
		public Entfernen() {
			super(UnionType.Entfernen);
		}
	}

	public static class Details extends AufgabenOverviewCommand {
		public Details() {
			super(UnionType.Details);
		}
	}

	public static class Selected extends AufgabenOverviewCommand {
		public final List<Aufgabe> aufgaben;

		public Selected(List<Aufgabe> aufgaben) {
			super(UnionType.Selected);
			this.aufgaben = aufgaben;
		}
	}
}